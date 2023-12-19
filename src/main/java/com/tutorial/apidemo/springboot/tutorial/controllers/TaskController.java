package com.tutorial.apidemo.springboot.tutorial.controllers;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Task;
import com.tutorial.apidemo.springboot.tutorial.repositories.TaskRepository;
import com.tutorial.apidemo.springboot.tutorial.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TaskController {
    @Autowired
    public TaskService taskService;
    @GetMapping
    public List<?> getAllTask(){
        return taskService.getAllTask();
    }
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }
    @PostMapping("/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
    @GetMapping("/find/{id}")
    public List<?> findEmployeeByIdTask(@PathVariable Long id) {
        return taskService.findEmployeeByIdTask(id);
    }
    @GetMapping("/find-task")
    public List<Task> findTask(){
        return taskService.findTask();
    }
    @GetMapping("/count")
    public List<?> countStatus() {
        return taskService.countStatus();
    }

    @GetMapping("/by-name/{employeeName}")
    public List<?> chartEmployeeStatus(@RequestParam List<String> employeeName) {
        return taskService.chartEmployeeStatus(employeeName);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        Task findTask = taskService.getTaskById(id);

        if(findTask == null) {
            return ResponseEntity.notFound().build();
        }

        findTask.setTaskName(task.getTaskName());
        findTask.setStartTime(task.getStartTime());
        findTask.setEndTime(task.getEndTime());
        findTask.setDeadline(task.getDeadline());
        findTask.setImportant(task.getImportant());
        findTask.setStatus(task.getStatus());
        findTask.setAssigner(task.getAssigner());
        findTask.setSupervisor(task.getSupervisor());
        findTask.setProgress(task.getProgress());
        findTask.setProjectID(task.getProjectID());
        findTask.setEmployees(task.getEmployees());

        Task updatedTask = taskService.updateTask(findTask);

        return ResponseEntity.ok(updatedTask);

    }


}
