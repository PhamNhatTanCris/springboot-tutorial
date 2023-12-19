package com.tutorial.apidemo.springboot.tutorial.repositories;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
