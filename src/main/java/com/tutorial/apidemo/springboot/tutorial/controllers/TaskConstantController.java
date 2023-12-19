package com.tutorial.apidemo.springboot.tutorial.controllers;

import com.tutorial.apidemo.springboot.tutorial.models.entities.TaskConstant;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task-constant")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TaskConstantController {
    @GetMapping
    public TaskConstant[] getTaskConstant(){
        return TaskConstant.values();
    }
}
