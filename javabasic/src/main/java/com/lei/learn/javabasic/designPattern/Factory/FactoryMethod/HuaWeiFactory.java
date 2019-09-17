package com.lei.learn.javabasic.designPattern.Factory.FactoryMethod;

public class HuaWeiFactory implements Factory {
  @Override
  public Phone makePhone() {
    return new HuaWei();
  }
}
