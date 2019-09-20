package com.lei.learn.javabasic.designPattern.Structural.Proxy.DynamicProxy;

public class SuperCell implements Game {
    @Override
    public void playGame() {
        System.out.println("Play super cell game, like coc");
    }
}
