package musicPlatform.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MusicAlbum")
public class MusicAlbumEntity {
    //--------------FIELDS--------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musicAlbumId")
    private long musicAlbumId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @ManyToOne
    @JoinColumn(name = "musicBandId")
    private MusicBandEntity musicBandId;

    @OneToMany(mappedBy = "musicAlbumId",cascade = CascadeType.ALL)
    private Set<MusicTrackEntity> musicTracks = new HashSet<>();
    //---------------------------------------------------------------------------------------------//
                    // Getters and setters, toString, equals, hashCod//
    //---------------------------------------------------------------------------------------------//
    public Set<MusicTrackEntity> getMusicTracks() {
        return musicTracks;
    }

    public void setMusicTracks(Set<MusicTrackEntity> musicTracks) {
        this.musicTracks = musicTracks;
    }

    public MusicBandEntity getMusicBandId() {
        return musicBandId;
    }

    public void setMusicBandId(MusicBandEntity musicBandId) {
        this.musicBandId = musicBandId;
    }

    public long getMusicAlbumId() {
        return musicAlbumId;
    }

    public void setMusicAlbumId(long musicAlbumId) {
        this.musicAlbumId = musicAlbumId;
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
        return "MusicAlbumEntity{" +
                "musicAlbumId=" + musicAlbumId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", musicBandId=" + musicBandId +
                '}';
    }
}

