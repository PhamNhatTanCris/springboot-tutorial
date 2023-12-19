package com.tutorial.apidemo.springboot.tutorial.controllers;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Manager;
import com.tutorial.apidemo.springboot.tutorial.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/manager")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping
    public List<Manager> getAllManager(){
        return managerService.getAllManager();
    }

    @GetMapping("/{id}")
    public Manager getManagerById(@PathVariable Long id) {
        return managerService.getManagerById(id);
    }

    @PostMapping("/create")
    public Manager createManager(@RequestBody Manager manager){
        return managerService.createManager(manager);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long id, @RequestBody Manager manager) {
        Manager findManager = managerService.getManagerById(id);
        if(findManager == null) {
            return ResponseEntity.notFound().build();
        }
        findManager.setManagerName(manager.getManagerName());
        Manager updatedManager = managerService.createManager(manager);
        return ResponseEntity.ok(updatedManager);
    }

    @DeleteMapping("/{id}")
    public void deleteManager(@PathVariable Long id) {
        managerService.deleteManager(id);
    }



}
