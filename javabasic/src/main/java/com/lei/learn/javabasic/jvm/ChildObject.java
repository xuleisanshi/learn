package com.lei.learn.javabasic.jvm;

public class ChildObject extends ParentObject {

  private static String string = "ChildObject 静态变量";

  static {
    System.out.println("ChildObject 静态变量：" + string);
  }

  private String string2 = "动态变量";

  public ChildObject() {
    System.out.println("ChildObject构造器");
  }

  {
    System.out.println("ChildObject 动态变量：" + string2);
  }

  public static void main(String[] args) {
    ChildObject childObject1 = new ChildObject();
    System.out.println("======第二次实例化=======");
    ChildObject childObject2 = new ChildObject();
  }
}
