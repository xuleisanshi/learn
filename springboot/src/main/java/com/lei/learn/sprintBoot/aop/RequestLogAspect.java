package com.lei.learn.sprintBoot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class RequestLogAspect {
  Logger logger = Logger.getLogger(String.valueOf(String.class));

  @Pointcut("@annotation(com.lei.learn.sprintBoot.aop.RequestLog)")
  public void requestLog() {
  }

  @Before("requestLog()")
  public void doBeforeController(JoinPoint joinPoint) {
    ServletRequestAttributes requestAttributes =
        (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    HttpServletRequest request = requestAttributes.getRequest();
    logger.info("请求地址:" + request.getRequestURL().toString());
    logger.info("请求方式:" + request.getMethod());
    logger.info("请求类方法:" + joinPoint.getSignature());
    logger.info("请求类方法参数:" + Arrays.toString(joinPoint.getArgs()));
    System.out.println("====before============");
  }

  @After("requestLog()")
  public void doAfterController(JoinPoint joinPoint) {
    System.out.println(joinPoint.toString());
    System.out.println("====after============");
  }
}
