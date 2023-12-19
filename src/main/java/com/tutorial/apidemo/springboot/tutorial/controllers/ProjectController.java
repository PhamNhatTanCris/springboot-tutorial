package com.tutorial.apidemo.springboot.tutorial.controllers;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Project;
import com.tutorial.apidemo.springboot.tutorial.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/project")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProjectController {
    @Autowired
    public ProjectService projectService;

    @GetMapping
    public List<Project> getAllProject() {
        return projectService.getAllProject();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("/create")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }


}
