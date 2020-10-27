package musicPlatform.service.impl;

import musicPlatform.converter.MusicBandConverter;
import musicPlatform.dao.MusicBandRepo;
import musicPlatform.dto.MusicBandDto;
import musicPlatform.entity.MusicBandEntity;
import musicPlatform.service.MusicBandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MusicBandServiceImpl implements MusicBandService {

    private MusicBandRepo musicBandRepo;
    private MusicBandConverter musicBandConverter;

    @Autowired
    public MusicBandServiceImpl(MusicBandRepo musicBandRepo, MusicBandConverter musicBandConverter) {
        this.musicBandRepo = musicBandRepo;
        this.musicBandConverter = musicBandConverter;
    }

    @Override
    public MusicBandDto getMusicBandDtoById(Long id) {
        try {
            return musicBandConverter.convertEntityToDto(musicBandRepo.findById(id).orElseThrow(Exception::new));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Set<MusicBandDto> getAllMusicBand() {
        Set<MusicBandDto> mbdSet = new HashSet<>();
        Iterable<MusicBandEntity> mte = musicBandRepo.findAll();

        for (MusicBandEntity x: mte
        ) {
            mbdSet.add(musicBandConverter.convertEntityToDto(x));
        }
        return mbdSet;
    }

    @Override
    public void saveMusicBand(MusicBandDto musicBandDto) {
        musicBandRepo.save(musicBandConverter.convertDtoToEntity(musicBandDto));
    }

    @Override
    public void updateMusicBand(MusicBandDto musicBandDto) {
        musicBandRepo.save(musicBandConverter.convertDtoToEntity(musicBandDto));
    }

    @Override
    public void deleteMusicBand(Long id) {
        musicBandRepo.deleteById(id);
    }
}
