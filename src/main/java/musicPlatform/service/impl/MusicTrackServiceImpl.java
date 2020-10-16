package musicPlatform.service.impl;

import musicPlatform.converter.MusicTrackConverter;
import musicPlatform.dao.MusicTrackRepo;
import musicPlatform.dto.MusicTrackDto;
import musicPlatform.service.MusicTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MusicTrackServiceImpl implements MusicTrackService {

    private final MusicTrackConverter musicTrackConverter;
    private final MusicTrackRepo musicTrackRepo;

    @Autowired
    public MusicTrackServiceImpl(MusicTrackConverter musicTrackConverter, MusicTrackRepo musicTrackRepo) {
        this.musicTrackConverter = musicTrackConverter;
        this.musicTrackRepo = musicTrackRepo;
    }

    @Override
    public MusicTrackDto getMusicTrackDtoById(Long id) {
        try {
            return musicTrackConverter.convertEntityToDto(musicTrackRepo.findById(id).orElseThrow(Exception::new));
        }
        catch(Exception e){
            e.getStackTrace();
        }
        return null;
    }

    @Override
    public Set<MusicTrackDto> getAllMusicTrack() {
        return musicTrackRepo.findAll().stream().map(x -> musicTrackConverter.convertEntityToDto(x)).collect(Collectors.toSet());
    }

    @Override
    public void saveMusicTrack(MusicTrackDto musicTrackDto) {
        musicTrackRepo.save(musicTrackConverter.convertDtoToEntity(musicTrackDto));
    }

    @Override
    public void updateMusicTrack(MusicTrackDto musicTrackDto) throws Exception {
        musicTrackRepo.save(musicTrackConverter.convertDtoToEntity(musicTrackDto));
    }

    @Override
    public void deleteMusicTrack(Long id) {
        musicTrackRepo.deleteById(id);
    }
}
