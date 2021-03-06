package com.example.demo.repository;

import com.example.demo.domain.Task;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAll();
    Optional<User> findOneByLoginOrEmail(String login, String email);
}
