package io.github.pkuwwt.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import io.github.pkuwwt.demo.domain.User;
public interface UserRepository extends JpaRepository<User, Integer>
{ }
