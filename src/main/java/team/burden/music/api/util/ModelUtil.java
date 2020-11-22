package team.burden.music.api.util;

import team.burden.music.api.model.Song;
import team.burden.music.api.protos.Music;

/**
 * @program: music-api
 * @description:
 * @author: burden
 * @create: 2020-11-21 17:11
 */
public class ModelUtil {

    public static Song toModelSong(Music.Song song) {
        Song s = new Song();
        s.setTitle(song.getTitle());
        s.setCreator(song.getCreator());
        s.setDuration(song.getDuration());
        s.setTones(song.getTones().toByteArray());
        return s;
    }

}
