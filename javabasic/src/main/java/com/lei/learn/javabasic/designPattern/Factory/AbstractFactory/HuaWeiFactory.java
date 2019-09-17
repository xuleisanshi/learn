package com.lei.learn.javabasic.designPattern.Factory.AbstractFactory;

public class HuaWeiFactory implements Factory {
    @Override
    public Phone makePhone() {
        return new HuaWei();
    }

    @Override
    public Headset makeHeadset() {
        return new HuaWeiHeadset();
    }
}
