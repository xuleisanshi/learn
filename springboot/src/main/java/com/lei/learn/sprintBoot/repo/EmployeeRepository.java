package com.lei.learn.sprintBoot.repo;

import com.lei.learn.sprintBoot.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  Employee findByName(String name);
}
