package com.lei.learn.javabasic.designPattern.Structural.Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        SuperCell superCell = new SuperCell();
        Tencent tencent = new Tencent(superCell);

        Game game = (Game) Proxy.newProxyInstance(SuperCell.class.getClassLoader(), SuperCell.class.getInterfaces(), tencent);
        game.playGame();
    }
}
