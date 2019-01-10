package pl.javastart.equipy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.equipy.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
