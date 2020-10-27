package musicPlatform.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "musicBand")
public class MusicBandEntity {
    //--------------FIELDS--------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musicBandId")
    private Long musicBandId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @OneToMany(mappedBy = "musicBandId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(name = "MusicAlbums")
    private Set<MusicAlbumEntity> musicAlbums = new HashSet<>();
    @ManyToOne

    @JoinColumn(name = "stileId")
    /*@JoinTable(
            name = "stileBand", joinColumns = {@JoinColumn(name = "musicBandId")},
            inverseJoinColumns = {@JoinColumn(name = "stileId")}
    )*/
    private MusicStileEntity musicStilesId;
    //---------------------------------------------------------------------------------------------//
                    // Getters and setters, toString, equals, hashCod//
    //---------------------------------------------------------------------------------------------//

    public MusicStileEntity getMusicStilesId() {
        return musicStilesId;
    }

    public void setMusicStilesId(MusicStileEntity musicStilesId) {
        this.musicStilesId = musicStilesId;
    }

    public Set<MusicAlbumEntity> getMusicAlbums() {
        return musicAlbums;
    }

    public void setMusicAlbums(Set<MusicAlbumEntity> musicAlbums) {
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

    @Override
    public String toString() {
        return "MusicBandEntity{" +
                "musicBandId=" + musicBandId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
