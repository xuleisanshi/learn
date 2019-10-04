package com.lei.learn.javabasic.designPattern.Structural.Decorator;

public class KuanMian extends Noodles {

  public KuanMian() {
    description = "Kuan mian";
  }

  @Override
  public String concreteNoodles() {
    return description;
  }
}
