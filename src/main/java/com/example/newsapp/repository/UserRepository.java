package com.example.newsapp.repository;

import com.example.newsapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String username);
    User findByEmail(String email);

    Optional<User> findOneByLogin(String login);
}
