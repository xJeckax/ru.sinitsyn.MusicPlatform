package musicPlatform.dto;

import java.util.HashSet;
import java.util.Set;

public class MusicAlbumDto {
    //--------------FIELDS--------------//
    private Long musicAlbumId;

    private String name;

    private int age;

    private Long musicBandId;

    private Set<MusicTrackDto> musicTracks = new HashSet<>();
    //---------------------------------------------------------------------------------------------//
                    // Getters and setters, toString, equals, hashCod//
    //---------------------------------------------------------------------------------------------//
    public Set<MusicTrackDto> getMusicTracks() {
        return musicTracks;
    }

    public void setMusicTracks(Set<MusicTrackDto> musicTracks) {
        this.musicTracks = musicTracks;
    }

    public Long getMusicAlbumId() {
        return musicAlbumId;
    }

    public void setMusicAlbumId(Long musicAlbumId) {
        this.musicAlbumId = musicAlbumId;
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

    @Override
    public String toString() {
        return "MusicAlbumDto{" +
                "musicAlbumId=" + musicAlbumId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", musicBandId=" + musicBandId +
                '}';
    }
}
