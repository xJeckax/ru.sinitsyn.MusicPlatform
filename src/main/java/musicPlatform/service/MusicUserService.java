package musicPlatform.service;

import musicPlatform.dto.MusicUserDto;

import java.util.Set;

public interface MusicUserService {
    MusicUserDto getMusicUserDtoById(Long id);
    Set<MusicUserDto> getAllMusicUser();
    void saveMusicUser(MusicUserDto musicUserDto);
    void updateMusicUser(MusicUserDto musicUserDto) throws Exception;
    void deleteMusicUser(Long id);
}
