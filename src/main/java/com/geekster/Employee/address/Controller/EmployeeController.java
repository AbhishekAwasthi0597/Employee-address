package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.model.Address;
import com.geekster.Employee.address.model.Employee;
import com.geekster.Employee.address.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/employee")
    public  String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return  "Employee has been added";
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return  employeeService.getEmployee(id);
    }

    @DeleteMapping("/emloyee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
    @PutMapping("/employee/{id}/{Employee}")
    public  String updateEmployee(@PathVariable Long id , @PathVariable Employee employee){
        return  employeeService.updateEmployee(id,employee);
    }
}
