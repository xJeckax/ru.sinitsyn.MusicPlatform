package musicPlatform.configurations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("musicPlatform")
@PropertySource("application.properties")
@EnableJpaRepositories
public class AppConfiguration {


}
