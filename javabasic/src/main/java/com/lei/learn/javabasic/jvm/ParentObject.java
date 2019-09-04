package com.lei.learn.javabasic.jvm;

public abstract class ParentObject {
  private static String string = "ParentObject 静态变量";

  private String string1 = "ParentObject 动态变量";

  public ParentObject() {
    System.out.println("ParentObject构造器");
  }

  static {
    System.out.println("ParentObject 静态变量：" + string);
  }

  {
    System.out.println("ParentObject 动态变量：" + string1);
  }
}
