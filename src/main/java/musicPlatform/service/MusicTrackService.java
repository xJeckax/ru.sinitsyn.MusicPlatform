package musicPlatform.service;

import musicPlatform.dto.MusicTrackDto;

import java.util.Set;

public interface MusicTrackService {
    MusicTrackDto getMusicTrackDtoById(Long id);
    Set<MusicTrackDto> getAllMusicTrack();
    void saveMusicTrack(MusicTrackDto musicTrackDto);
    void updateMusicTrack(MusicTrackDto musicTrackDto) throws Exception;
    void deleteMusicTrack(Long id);
}
