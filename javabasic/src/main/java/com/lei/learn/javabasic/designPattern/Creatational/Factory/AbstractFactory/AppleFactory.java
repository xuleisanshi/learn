package com.lei.learn.javabasic.designPattern.Creatational.Factory.AbstractFactory;

public class AppleFactory implements Factory {
    @Override
    public Phone makePhone() {
        return new Apple();
    }

    @Override
    public Headset makeHeadset() {
        return new AirPod();
    }
}
