package team.burden.music.api.dao;

import team.burden.music.api.model.Song;

import java.util.List;
import java.util.Map;

/**
 * @program: music-api
 * @description:
 * @author: burden
 * @create: 2020-11-21 15:23
 */
public interface SongDao {

    void addSong(Song song);

    List<Song> getSongs(Map<String, Object> map);

    int getCount();

    void addDownloadCount(String title);

    Song getSong(String title);

}
