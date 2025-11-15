package in.ankit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.SongContent;

import java.util.Optional;
import java.util.UUID;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {

    Optional<SongContent> findOneBySongPublicId(UUID publicId);

}
