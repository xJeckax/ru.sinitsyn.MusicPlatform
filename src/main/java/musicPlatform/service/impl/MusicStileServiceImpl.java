package musicPlatform.service.impl;

import musicPlatform.converter.MusicStileConverter;
import musicPlatform.dao.MusicStileRepo;
import musicPlatform.dto.MusicBandDto;
import musicPlatform.dto.MusicStileDto;
import musicPlatform.service.MusicStileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MusicStileServiceImpl implements MusicStileService {

    private MusicStileRepo musicStileRepo;
    private MusicStileConverter musicStileConverter;

    @Autowired
    public MusicStileServiceImpl(MusicStileRepo musicStileRepo, MusicStileConverter musicStileConverter) {
        this.musicStileRepo = musicStileRepo;
        this.musicStileConverter = musicStileConverter;
    }

    @Override
    public MusicStileDto getMusicStileDtoById(Long id) {
        try {
            return musicStileConverter.convertEntityToDto(musicStileRepo.findById(id).orElseThrow(Exception::new));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Set<MusicStileDto> getAllMusicStile() {
        return musicStileRepo.findAll().stream().map(x -> musicStileConverter.convertEntityToDto(x)).collect(Collectors.toSet());
    }
    @Override
    public void saveMusicStile(MusicStileDto musicStileDto) {
        musicStileRepo.save(musicStileConverter.convertDtoToEntity(musicStileDto));
    }

    @Override
    public void updateMusicStile(MusicStileDto musicStileDto) {
        musicStileRepo.saveAndFlush(musicStileConverter.convertDtoToEntity(musicStileDto));
    }

    @Override
    public void deleteMusicStile(Long id) {
        musicStileRepo.deleteById(id);
    }
}
