package musicPlatform.service;

import musicPlatform.dto.MusicStileDto;

import java.util.Set;

public interface MusicStileService {
    MusicStileDto getMusicStileDtoById(Long id);
    Set<MusicStileDto> getAllMusicStile();
    void saveMusicStile(MusicStileDto musicStileDto);
    void updateMusicStile(MusicStileDto musicStileDto);
    void deleteMusicStile(Long id);
}
