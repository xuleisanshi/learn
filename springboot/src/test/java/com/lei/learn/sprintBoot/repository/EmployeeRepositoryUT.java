package com.lei.learn.sprintBoot.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

import com.lei.learn.sprintBoot.bean.Employee;
import com.lei.learn.sprintBoot.repo.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryUT {

  @Autowired
  private TestEntityManager testEntityManager;

  @Autowired
  private EmployeeRepository employeeRepository;

  @Test
  public void Test_FindByName() {
    //given

    Employee employee = new Employee("Lei");
    employee.setAge(18);
    testEntityManager.persist(employee);
    testEntityManager.flush();
    //when
    Employee res = employeeRepository.findByName("Lei");
    //then
    assertThat(employee.getName().equals(res.getName()));
    assertThat(employee.getAge(),is(res.getAge()));
  }
}
