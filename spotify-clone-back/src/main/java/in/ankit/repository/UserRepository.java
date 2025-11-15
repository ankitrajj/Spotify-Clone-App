package in.ankit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);

}
