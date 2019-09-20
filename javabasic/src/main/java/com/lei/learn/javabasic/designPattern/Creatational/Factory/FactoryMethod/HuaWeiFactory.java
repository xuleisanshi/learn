package com.lei.learn.javabasic.designPattern.Creatational.Factory.FactoryMethod;

public class HuaWeiFactory implements Factory {
  @Override
  public Phone makePhone() {
    return new HuaWei();
  }
}
