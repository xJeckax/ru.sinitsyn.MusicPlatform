package musicPlatform.dao;

import musicPlatform.entity.MusicTrackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicTrackRepo extends JpaRepository<MusicTrackEntity, Long> {
}
