package com.lei.learn.sprintBoot.controller;

import com.lei.learn.sprintBoot.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/restTemplate")
public class RestTemplateLearnController {

  private RestTemplate restTemplate;

  @Autowired
  public RestTemplateLearnController(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  @RequestMapping("/employee")
  public List<Employee> getEmployee() {

    String url = "http://127.0.0.1:8081/employee";
    ResponseEntity<List<Employee>> responseEntity = restTemplate
        .exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {
        });
    List<Employee> employees = responseEntity.getBody();
    return employees;
  }
}
