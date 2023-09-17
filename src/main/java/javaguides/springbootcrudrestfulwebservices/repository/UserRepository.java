package javaguides.springbootcrudrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import javaguides.springbootcrudrestfulwebservices.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
