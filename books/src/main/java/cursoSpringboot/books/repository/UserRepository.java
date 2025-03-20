package cursoSpringboot.books.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cursoSpringboot.books.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);

}
