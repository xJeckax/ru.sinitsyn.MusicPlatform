package musicPlatform.dao;

import musicPlatform.entity.MusicStileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicStileRepo extends CrudRepository<MusicStileEntity,Long> {
}
