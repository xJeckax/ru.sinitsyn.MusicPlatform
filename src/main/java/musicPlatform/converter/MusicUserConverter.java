package musicPlatform.converter;

import musicPlatform.dto.MusicUserDto;
import musicPlatform.entity.MusicUserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicUserConverter {

    private ModelMapper modelMapper;

    @Autowired
    public MusicUserConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MusicUserEntity convertDtoToEntity(MusicUserDto MusicUserDto){
        return modelMapper.map(MusicUserDto, MusicUserEntity.class);

    }

    public MusicUserDto convertEntityToDto(MusicUserEntity MusicUserEntity){
        return modelMapper.map(MusicUserEntity, MusicUserDto.class);

    }
}
