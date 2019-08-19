package com.lei.learn.sprintBoot.service;

import com.lei.learn.sprintBoot.bean.Employee;
import com.lei.learn.sprintBoot.repo.EmployeeRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceUT {

    @Autowired
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Before
    public void setup() {
        Employee employee = new Employee("lei");
        employee.setAge(18);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        Mockito.when(employeeRepository.findAll()).thenReturn(employees);
        Mockito.when(employeeRepository.findByName(anyString())).thenReturn(employee);
        Mockito.when(employeeRepository.save(any())).thenReturn(employee);
    }

    @After
    public void after() {

    }

    @Test
    public void Test_saveEmployee() {
        Employee employee = new Employee("lei");
        employee.setAge(18);
        Employee res = employeeService.saveEmployee(employee);
        assertThat(res.getName()).isEqualTo(employee.getName());
        assertThat(res.getAge()).isEqualTo(employee.getAge());
    }

    @Test
    public void getEmployeeByName() {
        Employee res = employeeService.getEmployeeByName("lei");
        assertThat(res.getName()).isEqualTo("lei");
        assertThat(res.getAge()).isEqualTo(18);
    }
}