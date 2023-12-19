package com.tutorial.apidemo.springboot.tutorial.services;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Task;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface TaskService {
    List<Task> getAllTask();

    Task getTaskById(Long id);

    Task createTask(Task task);

    void deleteTask(Long id);

    List<?> findEmployeeByIdTask(Long id);

    List<Task> findTask();

    List<?> countStatus();

    List<?> chartEmployeeStatus(List<String> employeeName);

    Task updateTask(Task task);

}
