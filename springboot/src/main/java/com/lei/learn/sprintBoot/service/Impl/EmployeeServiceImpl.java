package com.lei.learn.sprintBoot.service.Impl;

import com.lei.learn.sprintBoot.bean.Employee;
import com.lei.learn.sprintBoot.repo.EmployeeRepository;
import com.lei.learn.sprintBoot.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

  @Autowired
  EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getAllUser() {
    LOGGER.info("Employee Service", "Ger all employee");
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
