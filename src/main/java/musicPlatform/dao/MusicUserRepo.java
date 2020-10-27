package musicPlatform.dao;

import musicPlatform.entity.MusicUserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicUserRepo extends CrudRepository<MusicUserEntity,Long> {
}
