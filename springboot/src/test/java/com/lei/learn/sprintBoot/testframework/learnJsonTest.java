package com.lei.learn.sprintBoot.testframework;

import static org.assertj.core.api.Assertions.assertThat;

import com.lei.learn.sprintBoot.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@JsonTest
public class learnJsonTest {

  @Autowired
  private JacksonTester<Employee> json;

  @Test
  public void testSerialize() throws Exception {
    Employee employee = new Employee("lei");
    employee.setAge(18);
    assertThat(this.json.write(employee)).hasJsonPathStringValue(("@.name"));
    assertThat(this.json.write(employee)).extractingJsonPathStringValue("@.name").isEqualTo("lei");
  }
}
