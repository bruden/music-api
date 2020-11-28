package team.burden.music.api.service;

import org.apache.commons.lang3.tuple.Pair;
import team.burden.music.api.protos.Grpc;
import team.burden.music.api.protos.Music;

import java.util.List;

/**
 * @program: music-api
 * @description:
 * @author: burden
 * @create: 2020-11-21 15:29
 */
public interface SongService {

    boolean addSong(Music.Song song);

    Pair<List<Grpc.SongWithoutTones>, Integer> getSongs(String text, int offset, int size);

    Music.Song getSong(String title);

}
