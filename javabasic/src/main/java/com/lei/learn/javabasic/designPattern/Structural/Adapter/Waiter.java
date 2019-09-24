package com.lei.learn.javabasic.designPattern.Structural.Adapter;

public class Waiter extends XihongshiEgg implements Flavoring {

  @Override
  public void addPepper() {
    super.cookingNoodles();
    System.out.println("面里加点胡椒");
  }
}
