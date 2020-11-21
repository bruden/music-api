package team.burden.music.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: music-api
 * @description:
 * @author: burden
 * @create: 2020-11-21 15:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    private String title;
    private String creator;
    private int druation;
    private Object tones;

}
