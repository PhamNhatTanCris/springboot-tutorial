package com.tutorial.apidemo.springboot.tutorial.services;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(String name, Long manageId, Long unitId);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    Employee createEmployee(Employee employee);

    void deleteEmployee(Long id);
}
