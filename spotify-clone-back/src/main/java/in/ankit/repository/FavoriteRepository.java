package in.ankit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.Favorite;
import in.ankit.entity.FavoriteId;

import java.util.List;
import java.util.UUID;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
    List<Favorite> findAllByUserEmailAndSongPublicIdIn(String email, List<UUID> songPublicIds);
}
