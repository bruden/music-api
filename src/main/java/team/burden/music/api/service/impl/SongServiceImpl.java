package team.burden.music.api.service.impl;

import com.google.protobuf.ByteString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import team.burden.music.api.dao.SongDao;
import team.burden.music.api.model.Song;
import team.burden.music.api.protos.Grpc;
import team.burden.music.api.protos.Music;
import team.burden.music.api.service.SongService;
import team.burden.music.api.util.ModelUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: music-api
 * @description:
 * @author: burden
 * @create: 2020-11-21 15:32
 */
@Service(value = "songService")
public class SongServiceImpl implements SongService {

    private static Logger logger = LoggerFactory.getLogger(SongServiceImpl.class);

    @Resource
    private SongDao songDao;

    @Override
    public boolean addSong(Music.Song song) {
        try {
            Song s = ModelUtil.toModelSong(song);
            songDao.addSong(s);
            return true;
        } catch (Exception e) {
            logger.error("", e);
            return false;
        }
    }

    @Override
    public List<Grpc.SongWithoutTones> getSongs() {
        List<Song> songs = songDao.getSongs();
        List<Grpc.SongWithoutTones> result = new ArrayList<>();
        for (Song song : songs) {
            result.add(Grpc.SongWithoutTones.newBuilder()
                    .setTitle(song.getTitle())
                    .setCreator(song.getCreator())
                    .build());
        }
        return result;
    }

    @Override
    public Music.Song getSong(String title) {
        Song song = songDao.getSong(title);
        if (song != null) {
            return Music.Song.newBuilder()
                    .setTitle(song.getTitle())
                    .setCreator(song.getCreator())
                    .setDuration(song.getDuration())
                    .setTones(ByteString.copyFrom((byte[]) song.getTones()))
                    .build();
        }
        return null;
    }

}
