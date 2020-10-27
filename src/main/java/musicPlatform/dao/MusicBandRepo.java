package musicPlatform.dao;

import musicPlatform.entity.MusicBandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicBandRepo extends CrudRepository<MusicBandEntity, Long> {

}
