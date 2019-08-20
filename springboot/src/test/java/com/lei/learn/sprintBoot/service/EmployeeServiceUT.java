package com.lei.learn.sprintBoot.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

import com.lei.learn.sprintBoot.bean.Employee;
import com.lei.learn.sprintBoot.repo.EmployeeRepository;
import com.lei.learn.sprintBoot.service.Impl.EmployeeServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class EmployeeServiceUT {

  /**
   * To check the Service class, we need to have an instance of Service class created and
   * available as a @Bean so
   * that we can @Autowire it in our test class. This configuration is achieved by using the
   *
   * @TestConfiguration annotation.
   * <p>
   * During component scanning, we might find components or configurations created only for
   * specific tests
   * accidentally get picked up everywhere. To help prevent that, Spring Boot provides
   * @TestConfiguration annotation
   * that can be used on classes in src/test/java to indicate that they should not be picked up
   * by scanning.
   * <p>
   * Another interesting thing here is the use of @MockBean. It creates a Mock for the
   * EmployeeRepository
   * which can be used to bypass the call to the actual EmployeeRepository:
   *
   */
  //    @TestConfiguration
  //    static class EmployeeServiceUTContextConfiguration {
  //        @Bean
  //        public EmployeeService employeeService() {
  //            return new EmployeeServiceImpl();
  //        }
  //    }

  /**
   * or by @InjectMock to mock the employee service impl
   * Another interesting thing here is the use of @MockBean. It creates a Mock for the
   *    * EmployeeRepository
   *    * which can be used to bypass the call to the actual EmployeeRepository:
   */
  @InjectMocks
  private EmployeeServiceImpl employeeService;

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
  public void Test_getEmployeeByName() {
    Employee res = employeeService.getEmployeeByName("lei");
    assertThat(res.getName()).isEqualTo("lei");
    assertThat(res.getAge()).isEqualTo(18);
  }
}