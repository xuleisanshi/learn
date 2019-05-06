package com.lei.learn.sprintBoot;

import com.lei.learn.sprintBoot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring boot 单元测试
 * 测试期间，可以自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SprintBootLearningApplication.class)
public class SprintBootLearningApplicationTests {


	@Autowired
	Person person;

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
