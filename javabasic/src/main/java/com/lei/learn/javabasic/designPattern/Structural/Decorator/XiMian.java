package com.lei.learn.javabasic.designPattern.Structural.Decorator;

public class XiMian extends Noodles {

  public XiMian() {
    description = "Xi Mian";
  }

  @Override
  public String concreteNoodles() {
    return description;
  }
}
