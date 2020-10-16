package musicPlatform.service.impl;

import musicPlatform.converter.MusicAlbumConverter;
import musicPlatform.dao.MusicAlbumRepo;
import musicPlatform.dto.MusicAlbumDto;
import musicPlatform.entity.MusicAlbumEntity;
import musicPlatform.service.MusicAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MusicAlbumServiceImpl implements MusicAlbumService {

    private MusicAlbumRepo musicAlbumRepo;
    private MusicAlbumConverter musicAlbumConverter;

    @Autowired
    public MusicAlbumServiceImpl(MusicAlbumRepo musicAlbumRepo, MusicAlbumConverter musicAlbumConverter) {
        this.musicAlbumRepo = musicAlbumRepo;
        this.musicAlbumConverter = musicAlbumConverter;
    }

    @Override
    public MusicAlbumDto getMusicAlbumDtoById(Long id) {
        try {
            return musicAlbumConverter.convertEntityToDto(musicAlbumRepo.findById(id).orElseThrow(Exception::new));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Set<MusicAlbumDto> getAllMusicAlbum() {
        return musicAlbumRepo.findAll().stream().map(x -> musicAlbumConverter.convertEntityToDto(x)).collect(Collectors.toSet());
    }

    @Override
    public void saveMusicAlbum(MusicAlbumDto musicAlbumDto) {
        musicAlbumRepo.save(musicAlbumConverter.convertDtoToEntity(musicAlbumDto));
    }

    @Override
    public void updateMusicAlbum(MusicAlbumDto musicAlbumDto) throws Exception {
        MusicAlbumEntity musicAlbumEntity = musicAlbumRepo.findById(musicAlbumDto.getMusicAlbumId()).orElseThrow(Exception::new);
        musicAlbumEntity.setName(musicAlbumDto.getName());
        musicAlbumEntity.setAge(musicAlbumDto.getAge());

        musicAlbumRepo.save(musicAlbumEntity);
    }

    @Override
    public void deleteMusicAlbum(Long id) {
        musicAlbumRepo.deleteById(id);
    }
}
