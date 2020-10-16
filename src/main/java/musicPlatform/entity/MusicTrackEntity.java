package musicPlatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "MusicTracks")
public class MusicTrackEntity {
    //--------------FIELDS--------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musicTrackId")
    private Long musicTrackId;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "musicAlbumId")
    private MusicAlbumEntity musicAlbumId;
    //---------------------------------------------------------------------------------------------//
                        // Getters and setters, toString, equals, hashCod//
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

    public MusicAlbumEntity getMusicAlbumId() {
        return musicAlbumId;
    }

    public void setMusicAlbumId(MusicAlbumEntity musicAlbumId) {
        this.musicAlbumId = musicAlbumId;
    }
}
