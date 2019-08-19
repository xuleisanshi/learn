package com.lei.learn.sprintBoot.service;

import com.lei.learn.sprintBoot.bean.Employee;

import java.util.List;

public interface EmployeeService {
  List<Employee> getAllUser();

  Employee saveEmployee(Employee user);

  Employee getEmployeeByName(String name);
}
