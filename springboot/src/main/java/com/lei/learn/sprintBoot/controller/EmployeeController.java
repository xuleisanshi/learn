package com.lei.learn.sprintBoot.controller;

import com.lei.learn.sprintBoot.bean.Employee;
import com.lei.learn.sprintBoot.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  private EmployeeService employeeService;
  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

  @Autowired
  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @RequestMapping(method = RequestMethod.POST)
  public Employee saveUser(@RequestBody Employee employee) {
    return employeeService.saveEmployee(employee);
  }

  @RequestMapping(method = RequestMethod.GET)
  public List<Employee> getAllUser() {
    return employeeService.getAllUser();
  }

  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  public Employee getUserByName(@PathVariable String name) {
    return employeeService.getEmployeeByName(name);
  }
}
