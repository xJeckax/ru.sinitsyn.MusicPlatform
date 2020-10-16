package musicPlatform.service;

import musicPlatform.dto.MusicBandDto;

import java.util.Set;

public interface MusicBandService {
    MusicBandDto getMusicBandDtoById(Long id);
    Set<MusicBandDto> getAllMusicBand();
    void saveMusicBand(MusicBandDto musicAlbumDto);
    void updateMusicBand(MusicBandDto musicAlbumDto);
    void deleteMusicBand(Long id);
}
