package com.lei.learn.sprintBoot.service.Impl;

import com.lei.learn.sprintBoot.bean.Employee;
import com.lei.learn.sprintBoot.repo.EmployeeRepository;
import com.lei.learn.sprintBoot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getAllUser() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee saveEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  @Override
  public Employee getEmployeeByName(String name) {
    return employeeRepository.findByName(name);
  }
}
