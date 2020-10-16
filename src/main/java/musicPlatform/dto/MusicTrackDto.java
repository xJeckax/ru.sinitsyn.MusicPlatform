package musicPlatform.dto;

public class MusicTrackDto {
    //--------------FIELDS--------------//
    private Long musicTrackId;

    private String name;

    private Long musicAlbumId;
    //---------------------------------------------------------------------------------------------//
                     // Getters and setters, toString, equals, hashCod //
    //---------------------------------------------------------------------------------------------//
    public Long getMusicTrackId() {
        return musicTrackId;
    }

    public void setMusicTrackId(Long musicTrackId) {
        this.musicTrackId = musicTrackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMusicAlbumId() {
        return musicAlbumId;
    }

    public void setMusicAlbumId(Long musicAlbumId) {
        this.musicAlbumId = musicAlbumId;
    }
}
