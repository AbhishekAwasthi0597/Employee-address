package com.geekster.Employee.address.service;

import com.geekster.Employee.address.dao.EmployeeDao;
import com.geekster.Employee.address.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
    EmployeeDao employeeDao;
    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public Employee getEmployee(Long id) {
      return employeeDao.findById(id).get();
    }

  public String deleteEmployee(Long id) {
      employeeDao.deleteById(id);
      return "Employee deleted";
  }
    @Transactional
    public String updateEmployee(Long id, Employee employee) {
        if(employeeDao.existsById(id)){
            employeeDao.save(employee);
        }
        return "Employee get updated";
    }
}
