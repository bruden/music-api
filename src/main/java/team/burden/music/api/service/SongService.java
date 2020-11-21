package team.burden.music.api.service;

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

    List<Grpc.SongWithoutTones> getSongs();

    Music.Song getSong(String title);

}
