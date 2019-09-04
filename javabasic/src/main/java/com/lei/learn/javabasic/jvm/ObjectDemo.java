package com.lei.learn.javabasic.jvm;

public class ObjectDemo {

  private String string2 = "动态变量";
  private static String string1 = "静态变量";

  static {
    System.out.println("静态变量: " + string1);
  }

  {
    System.out.println("类的属性：" + string2);
  }

  public static void main(String[] args) {
    ObjectDemo objectDemo1 = new ObjectDemo();
    System.out.println("============第二次实例化===========");
    ObjectDemo objectDemo2 = new ObjectDemo();
  }
}
