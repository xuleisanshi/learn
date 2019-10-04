package com.lei.learn.javabasic.designPattern.Structural.Decorator;

public class Beef extends JiaoTou {
  Noodles noodles;

  public Beef(Noodles noodles) {
    this.noodles = noodles;
  }

  @Override
  public String getJiaoTou() {
    return "Beef";
  }

  @Override
  public String concreteNoodles() {
    return noodles.concreteNoodles() + " " + getJiaoTou();
  }
}
