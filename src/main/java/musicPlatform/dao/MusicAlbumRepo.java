package musicPlatform.dao;

import musicPlatform.entity.MusicAlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicAlbumRepo extends CrudRepository<MusicAlbumEntity, Long> {
}
