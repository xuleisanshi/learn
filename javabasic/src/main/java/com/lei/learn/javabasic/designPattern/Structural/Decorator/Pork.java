package com.lei.learn.javabasic.designPattern.Structural.Decorator;

public class Pork extends JiaoTou {
  Noodles noodles;

  public Pork(Noodles noodles) {
    this.noodles = noodles;
  }

  @Override
  public String getJiaoTou() {
    return "Pork";
  }

  @Override
  public String concreteNoodles() {
    return noodles.concreteNoodles() + " add " + getJiaoTou();
  }
}