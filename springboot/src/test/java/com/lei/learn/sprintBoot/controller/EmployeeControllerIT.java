package com.lei.learn.sprintBoot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.lei.learn.sprintBoot.bean.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class EmployeeControllerIT extends BaseIT {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void saveEmployee_whenGiveEmployee_thenStatus200() throws Exception {
        Employee employee = prepareEmployee();
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(employee);
        mockMvc.perform(post("/employee").contentType(MediaType.APPLICATION_JSON).content(requestJson))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    private Employee prepareEmployee() {
        Employee employee = new Employee("Lei");
        employee.setAge(18);
        return employee;
    }
}