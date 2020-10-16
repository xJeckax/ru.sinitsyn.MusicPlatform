package musicPlatform.converter;

import musicPlatform.dto.MusicStileDto;
import musicPlatform.entity.MusicStileEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicStileConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public MusicStileConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MusicStileDto convertEntityToDto(MusicStileEntity musicStileEntity){
        return modelMapper.map(musicStileEntity, MusicStileDto.class);
    }

    public MusicStileEntity convertDtoToEntity(MusicStileDto musicStileDto){
        return modelMapper.map(musicStileDto,MusicStileEntity.class);
    }
}
