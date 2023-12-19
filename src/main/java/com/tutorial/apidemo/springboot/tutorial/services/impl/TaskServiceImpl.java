package com.tutorial.apidemo.springboot.tutorial.services.impl;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Employee;
import com.tutorial.apidemo.springboot.tutorial.models.entities.Task;
import com.tutorial.apidemo.springboot.tutorial.models.entities.TaskConstant;
import com.tutorial.apidemo.springboot.tutorial.repositories.TaskRepository;
import com.tutorial.apidemo.springboot.tutorial.services.TaskService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<?> findEmployeeByIdTask(Long id) {
        return taskRepository.findEmployeeByIdTask(id);
    }

    @Override
    public List<Task> findTask() {
        return taskRepository.findTask();
    }

    @Override
    public List<?> countStatus() {
        return taskRepository.countStatus();
    }

    @Override
    public List<?> chartEmployeeStatus(List<String> employeeName) {
        return taskRepository.chartEmployeeStatus(employeeName);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

}
