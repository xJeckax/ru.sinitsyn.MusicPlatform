package musicPlatform.configurations;


import musicPlatform.dto.MusicAlbumDto;
import musicPlatform.dto.MusicBandDto;
import musicPlatform.dto.MusicStileDto;
import musicPlatform.dto.MusicTrackDto;
import musicPlatform.entity.MusicAlbumEntity;
import musicPlatform.entity.MusicBandEntity;
import musicPlatform.entity.MusicStileEntity;
import musicPlatform.entity.MusicTrackEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("musicPlatform")
@PropertySource("application.properties")
@EnableJpaRepositories
public class AppConfiguration {

    @Bean
    public ModelMapper instanceModelMapper(){
        ModelMapper mm = new ModelMapper();
        mm.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        mm.getConfiguration().setFieldMatchingEnabled(true);

        return mm;
    }

}
