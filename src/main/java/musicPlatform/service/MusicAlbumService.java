package musicPlatform.service;

import musicPlatform.dto.MusicAlbumDto;

import java.util.Set;

public interface MusicAlbumService {
    MusicAlbumDto getMusicAlbumDtoById(Long id);
    Set<MusicAlbumDto> getAllMusicAlbum();
    void saveMusicAlbum(MusicAlbumDto musicAlbumDto);
    void updateMusicAlbum(MusicAlbumDto musicAlbumDto) throws Exception;
    void deleteMusicAlbum(Long id);
}
