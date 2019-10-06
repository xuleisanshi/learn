package com.lei.learn.javabasic.designPattern.Structural.Decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Noodles noodles = new KuanMian();
        System.out.println(noodles.concreteNoodles());
        noodles = new Beef(noodles);

        System.out.println(noodles.concreteNoodles());
        noodles = new Pork(noodles);
        System.out.println(noodles.concreteNoodles());

        Noodles noodles1 = new XiMian();
        System.out.println(noodles1.concreteNoodles());
        noodles1 = new Beef(noodles1);

        System.out.println(noodles1.concreteNoodles());
        noodles1 = new Pork(noodles1);
        System.out.println(noodles1.concreteNoodles());
    }
}
