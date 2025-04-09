package ucb.example.examen2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucb.example.examen2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
