package team.burden.music.api.service.impl;

import com.google.protobuf.ByteString;
import org.apache.commons.lang3.tuple.Pair;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            s.setCreateTime(System.currentTimeMillis());
            songDao.addSong(s);
            return true;
        } catch (Exception e) {
            logger.error("", e);
            return false;
        }
    }

    @Override
    public Pair<List<Grpc.SongWithoutTones>, Integer> getSongs(String text, int offset, int size) {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put("offset", offset);
            put("size", size);
        }};
        List<Song> songs = songDao.getSongs(map);
        List<Grpc.SongWithoutTones> result = new ArrayList<>();
        for (Song song : songs) {
            result.add(Grpc.SongWithoutTones.newBuilder()
                    .setTitle(song.getTitle())
                    .setCreator(song.getCreator())
                    .setCreateTime(song.getCreateTime())
                    .setDownloadCount(song.getDownloadCount())
                    .setDuration(song.getDuration())
                    .build());
        }
        int count = songDao.getCount();
        return Pair.of(result, count);
    }

    @Override
    public Music.Song getSong(String title) {
        Song song = songDao.getSong(title);
        if (song != null) {
            songDao.addDownloadCount(song.getTitle());
            return Music.Song.newBuilder()
                    .setTitle(song.getTitle())
                    .setCreator(song.getCreator())
                    .setCreateTime(song.getCreateTime())
                    .setDownloadCount(song.getDownloadCount())
                    .setDuration(song.getDuration())
                    .setTones(ByteString.copyFrom((byte[]) song.getTones()))
                    .build();
        }
        return null;
    }

}
