package com.tutorial.apidemo.springboot.tutorial.repositories;

import com.tutorial.apidemo.springboot.tutorial.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);


}

