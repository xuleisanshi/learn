package com.lei.learn.sprintBoot.service.Impl;

import com.lei.learn.sprintBoot.service.InjectTest;
import org.springframework.stereotype.Service;

@Service
public class InjectTestImpl1 implements InjectTest {
  @Override
  public void inject() {
    System.out.println("Inject test impl 1");
  }
}
