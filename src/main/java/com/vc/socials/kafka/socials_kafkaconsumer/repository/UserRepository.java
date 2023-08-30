package com.vc.socials.kafka.socials_kafkaconsumer.repository;

import com.vc.socials.kafka.socials_kafkaconsumer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    // Optional<User> findById(Long id);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    Boolean existsByUsernameAndPassword(String username, String password);
}