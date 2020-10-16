package musicPlatform.converter;

import musicPlatform.dto.MusicBandDto;
import musicPlatform.dto.MusicTrackDto;
import musicPlatform.entity.MusicBandEntity;
import musicPlatform.entity.MusicTrackEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicTrackConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public MusicTrackConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MusicTrackDto convertEntityToDto(MusicTrackEntity musicTrackEntity){
        return modelMapper.map(musicTrackEntity, MusicTrackDto.class);
    }

    public MusicTrackEntity convertDtoToEntity(MusicTrackDto musicTrackDto){
        return modelMapper.map(musicTrackDto,MusicTrackEntity.class);
    }

}
