package com.lei.learn.sprintBoot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class InjectInterfaceControllerTestIT extends BaseIT {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void test_inject() throws Exception {
    mockMvc.perform(get("/injectInterface")).andExpect(status().isOk());
  }
}