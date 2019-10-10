package com.lei.learn.sprintBoot.controller;

import com.lei.learn.sprintBoot.service.InjectTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/injectInterface")
public class InjectInterfaceController {

  @Resource(name = "injectTestImpl1")
  public final InjectTest inject;

  public InjectInterfaceController(InjectTest injectTestImpl1) {
    this.inject = injectTestImpl1;
  }

  @RequestMapping(method = RequestMethod.GET)
  public void getInjectInterfaceImpl() {
    inject.inject();
  }
}
