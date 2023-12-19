package com.tutorial.apidemo.springboot.tutorial.services.impl;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Manager;
import com.tutorial.apidemo.springboot.tutorial.repositories.ManagerRepository;
import com.tutorial.apidemo.springboot.tutorial.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    public ManagerRepository managerRepository;

    @Override
    public List<Manager> getAllManager() {
        return managerRepository.findAll();
    }
    @Override
    public Manager getManagerById(Long id) {
        return managerRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tim thấy đơn vị có id = " + id));
    }

    @Override
    public Manager createManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void deleteManager(Long id) {
        managerRepository.deleteById(id);
    }
}
