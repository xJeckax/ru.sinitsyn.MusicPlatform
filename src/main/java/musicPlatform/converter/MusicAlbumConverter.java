package musicPlatform.converter;

import musicPlatform.dto.MusicAlbumDto;
import musicPlatform.entity.MusicAlbumEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicAlbumConverter {


    private final ModelMapper modelMapper;

    @Autowired
    public MusicAlbumConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MusicAlbumDto convertEntityToDto(MusicAlbumEntity musicAlbumEntity){
        return modelMapper.map(musicAlbumEntity,MusicAlbumDto.class);
    }

    public MusicAlbumEntity convertDtoToEntity(MusicAlbumDto musicAlbumDto){
        return modelMapper.map(musicAlbumDto,MusicAlbumEntity.class);
    }
}
