package musicPlatform.service.impl;

import musicPlatform.converter.MusicUserConverter;
import musicPlatform.dao.MusicUserRepo;
import musicPlatform.dto.MusicUserDto;
import musicPlatform.entity.MusicUserEntity;
import musicPlatform.service.MusicUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MusicUserServiceImpl implements MusicUserService {

    private final MusicUserRepo musicUserRepo;
    private final MusicUserConverter musicUserConverter;

    @Autowired
    public MusicUserServiceImpl(MusicUserRepo musicUserRepo, MusicUserConverter musicUserConverter) {
        this.musicUserRepo = musicUserRepo;
        this.musicUserConverter = musicUserConverter;
    }

    @Override
    public MusicUserDto getMusicUserDtoById(Long id) {
        try {
            return musicUserConverter.convertEntityToDto(musicUserRepo.findById(id).orElseThrow(Exception::new));
        }
        catch(Exception e){
            e.getStackTrace();
        }
        return  null;
    }

    @Override
    public Set<MusicUserDto> getAllMusicUser() {
        Set<MusicUserDto> mud = new HashSet<>();
        Iterable<MusicUserEntity> mue = musicUserRepo.findAll();

        for (MusicUserEntity x : mue) {
            mud.add(musicUserConverter.convertEntityToDto(x));
        }
        return mud;
    }

    @Override
    public void saveMusicUser(MusicUserDto musicUserDto) {
        musicUserRepo.save(musicUserConverter.convertDtoToEntity(musicUserDto));
    }

    @Override
    public void updateMusicUser(MusicUserDto musicUserDto) throws Exception {
        musicUserRepo.save(musicUserConverter.convertDtoToEntity(musicUserDto));
    }

    @Override
    public void deleteMusicUser(Long id) {
        musicUserRepo.deleteById(id);
    }
}
