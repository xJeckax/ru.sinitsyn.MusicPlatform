package musicPlatform.converter;

import musicPlatform.dto.MusicAlbumDto;
import musicPlatform.dto.MusicBandDto;
import musicPlatform.entity.MusicAlbumEntity;
import musicPlatform.entity.MusicBandEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicBandConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public MusicBandConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MusicBandDto convertEntityToDto(MusicBandEntity musicBandEntity){
        return modelMapper.map(musicBandEntity, MusicBandDto.class);
    }

    public MusicBandEntity convertDtoToEntity(MusicBandDto musicBandDto){
        return modelMapper.map(musicBandDto,MusicBandEntity.class);
    }
}
