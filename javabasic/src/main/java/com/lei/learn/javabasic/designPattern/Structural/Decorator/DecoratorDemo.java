package com.lei.learn.javabasic.designPattern.Structural.Decorator;

public class DecoratorDemo {

  public static void main(String[] args) {

    Noodles noodles = new KuanMian();
    System.out.println(noodles.concreteNoodles());
    noodles = new Beef(noodles);

    System.out.println(noodles.concreteNoodles());
    noodles = new Pork(noodles);
    System.out.println(noodles.concreteNoodles());

    Noodles ximian = new XiMian();
    ximian = new Beef(ximian);
    ximian = new Pork(ximian);

    System.out.println(ximian.concreteNoodles());
  }
}
