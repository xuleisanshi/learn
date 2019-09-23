package com.lei.learn.javabasic.designPattern.Proxy.CGlib;

public class ProxyDemo {

    public static void main(String[] args) {
        SupperCell supperCell = (SupperCell) new Tencent().getProxy(SupperCell.class);
        supperCell.playGame();

    }
}
