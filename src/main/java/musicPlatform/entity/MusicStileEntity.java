package musicPlatform.entity;

import musicPlatform.enums.MusicStile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Stile")
public class MusicStileEntity {
    //--------------FIELDS--------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stileId")
    private Long stileId;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "musicStile")
    private MusicStile musicStile;
    @OneToMany(mappedBy = "musicStilesId")
    @Column(name = "musicBandId", nullable = true)
    private Set<MusicBandEntity> musicBandId = new HashSet<>();
    //---------------------------------------------------------------------------------------------//
                    // Getters and setters, toString, equals, hashCod//
    //---------------------------------------------------------------------------------------------//

    public Long getStileId() {
        return stileId;
    }

    public void setStileId(Long stileId) {
        this.stileId = stileId;
    }

    public MusicStile getMusicStile() {
        return musicStile;
    }

    public void setMusicStile(MusicStile musicStile) {
        this.musicStile = musicStile;
    }

    public Set<MusicBandEntity> getMusicBandId() {
        return musicBandId;
    }

    public void setMusicBandId(Set<MusicBandEntity> musicBandId) {
        this.musicBandId = musicBandId;
    }
}
