package me.dulanjana.demo.repo;

import me.dulanjana.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, String> {
}
