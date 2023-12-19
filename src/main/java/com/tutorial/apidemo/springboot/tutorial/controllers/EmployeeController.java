package com.tutorial.apidemo.springboot.tutorial.controllers;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Employee;
import com.tutorial.apidemo.springboot.tutorial.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);

    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee ) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @PostMapping("/addemployee")
    public void addEmployee(){
        employeeService.addEmployee("Râu con", 1L, 1L);
        employeeService.addEmployee("Râu cha", 2L, 3L);
        employeeService.addEmployee("Con ruột fifa", 2L, 4L);
        employeeService.addEmployee("Uefanola", 2L, 2L);
        employeeService.addEmployee("Con trai của bố fifa, uefa", 5L, 6L);
        employeeService.addEmployee("Thor gọi búa, thua gọi bố", 4L, 5L);
        employeeService.addEmployee("Đi bộ vuốt râu", 4L, 3L);
        employeeService.addEmployee("Chấm pen ai vẽ mà tròn, Hàm râu ai vuốt mà mòn một bên", 1L, 1L);
        employeeService.addEmployee("Con trai cưng của bố fifa", 1L, 1L);
        employeeService.addEmployee("Thập phong công tử", 1L, 1L);
        employeeService.addEmployee("Pepsi quá đã", 1L, 1L);
        employeeService.addEmployee("Ngụy quân tử", 1L, 1L);
        employeeService.addEmployee("9 giờ 53 hoặc 10 giờ kém 7", 1L, 2L);
    }

}
