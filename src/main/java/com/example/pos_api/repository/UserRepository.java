package com.example.pos_api.repository;

import com.example.pos_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> userName(String userName);

}
