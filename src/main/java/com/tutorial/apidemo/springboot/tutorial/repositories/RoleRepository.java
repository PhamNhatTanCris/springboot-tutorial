package com.tutorial.apidemo.springboot.tutorial.repositories;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
