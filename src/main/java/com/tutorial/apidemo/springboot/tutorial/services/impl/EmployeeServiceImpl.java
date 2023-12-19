package com.tutorial.apidemo.springboot.tutorial.services.impl;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Employee;
import com.tutorial.apidemo.springboot.tutorial.repositories.EmployeeRepository;
import com.tutorial.apidemo.springboot.tutorial.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(String name, Long manageId, Long unitId){
        Employee employee = new Employee();
        employee.setEmployeeName(name);


        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên có id = " + id));
    }

    @Override
    public Employee updateEmployee(Long id, Employee newEmployee) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setEmployeeName(newEmployee.getEmployeeName());
                    employee.setManager(newEmployee.getManager());
                    employee.setUnit(newEmployee.getUnit());
                    return employeeRepository.save(employee);
                })
                .orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên có id = " + id));

    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
