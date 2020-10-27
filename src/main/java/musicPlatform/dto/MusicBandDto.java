package musicPlatform.dto;

import java.util.HashSet;
import java.util.Set;

public class MusicBandDto {
    //--------------FIELDS--------------//
    private Long musicBandId;
    private String name;
    private int age;
    private Set<MusicAlbumDto> musicAlbums = new HashSet<>();
    private Long musicStilesId;

    //---------------------------------------------------------------------------------------------//
                    // Getters and setters, toString, equals, hashCod//
    //---------------------------------------------------------------------------------------------//


    public Long getMusicStilesId() {
        return musicStilesId;
    }

    public void setMusicStilesId(Long musicStilesId) {
        this.musicStilesId = musicStilesId;
    }

    public Set<MusicAlbumDto> getMusicAlbums() {
        return musicAlbums;
    }

    public void setMusicAlbums(Set<MusicAlbumDto> musicAlbums) {
        this.musicAlbums = musicAlbums;
    }

    public Long getMusicBandId() {
        return musicBandId;
    }

    public void setMusicBandId(Long musicBandId) {
        this.musicBandId = musicBandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
