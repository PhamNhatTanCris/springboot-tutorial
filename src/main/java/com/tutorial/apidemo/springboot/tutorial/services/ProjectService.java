package com.tutorial.apidemo.springboot.tutorial.services;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Project;

import java.util.List;


public interface ProjectService {
    List<Project> getAllProject();

    Project getProjectById(Long id);

    Project createProject(Project project);

    void deleteProject(Long id);
}
