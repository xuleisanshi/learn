package com.lei.learn.javabasic.jvm;

class Person {

  private Long id;
  private String name;

  private static String country;
}

public class jvmTest {

  public static void main(String[] args) {
    //存放在常量池中
    String a = "hello";
    //去常量池中查找，若存在则直接引用，若不存在，则在常量池中新建。
    String b = "hello";
    System.out.println(a == b);//a, b 均指向常量池中，a，b作为变量，存储在栈中。
    System.out.println(a.equals(b));
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println("====");
  }
}
