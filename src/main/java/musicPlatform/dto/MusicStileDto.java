package musicPlatform.dto;

import musicPlatform.entity.MusicBandEntity;
import musicPlatform.enums.MusicStile;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

public class MusicStileDto {
    //--------------FIELDS--------------//
    private Long stileId;

    private String musicStile;

    private Set<MusicBandDto> musicBandId = new HashSet<>();
    //---------------------------------------------------------------------------------------------//
                    // Getters and setters, toString, equals, hashCod//
    //---------------------------------------------------------------------------------------------//

    public Long getStileId() {
        return stileId;
    }

    public void setStileId(Long stileId) {
        this.stileId = stileId;
    }

    public String getMusicStile() {
        return musicStile;
    }

    public void setMusicStile(String musicStile) {
        this.musicStile = musicStile;
    }

    public Set<MusicBandDto> getMusicBandId() {
        return musicBandId;
    }

    public void setMusicBandId(Set<MusicBandDto> musicBandId) {
        this.musicBandId = musicBandId;
    }
}
