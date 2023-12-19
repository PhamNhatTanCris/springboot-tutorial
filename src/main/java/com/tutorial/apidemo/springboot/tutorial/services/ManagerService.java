package com.tutorial.apidemo.springboot.tutorial.services;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> getAllManager();

    Manager getManagerById(Long id);

    Manager createManager(Manager manager);

    void deleteManager(Long id);

}
