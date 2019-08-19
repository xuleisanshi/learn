package com.lei.learn.sprintBoot.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  //  定义认证规则
  //  @Override
  //  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
  //    auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("user")
  //        .password(new BCryptPasswordEncoder().encode("123")).roles("USER").and()
  //        .passwordEncoder(new BCryptPasswordEncoder()).withUser("admin")
  //        .password(new BCryptPasswordEncoder().encode("123")).roles("ADMIN");
  //  }

  //  定义授权规则
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers(HttpMethod.POST, "/").permitAll().and().csrf().disable();
    //    http.formLogin();
    //    http.authorizeRequests().antMatchers("/**").permitAll();
    // .antMatchers("/admin").hasRole("ADMIN")
    //        .antMatchers("/user").hasRole("USER").antMatchers("/employee/**").permitAll()
    //        .antMatchers("/**").permitAll()
    //    http.rememberMe();
    //    http.logout().logoutSuccessUrl("/");
  }
}
