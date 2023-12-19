package com.tutorial.apidemo.springboot.tutorial.repositories;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
