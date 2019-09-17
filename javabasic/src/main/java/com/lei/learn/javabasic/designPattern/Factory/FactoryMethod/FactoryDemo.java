package com.lei.learn.javabasic.designPattern.Factory.FactoryMethod;

public class FactoryDemo {
  public static void main(String[] args) {
    AppleFactory appleFactory = new AppleFactory();
    HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
    appleFactory.makePhone().getName();
    huaWeiFactory.makePhone().getName();

  }
}
