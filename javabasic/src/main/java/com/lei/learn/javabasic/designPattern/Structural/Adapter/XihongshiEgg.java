package com.lei.learn.javabasic.designPattern.Structural.Adapter;

public class XihongshiEgg implements Kitchen {

  @Override
  public void cookingNoodles() {
    System.out.println("做面： 西红柿鸡蛋面");
  }
}
