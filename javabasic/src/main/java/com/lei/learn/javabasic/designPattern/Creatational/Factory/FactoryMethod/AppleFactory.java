package com.lei.learn.javabasic.designPattern.Creatational.Factory.FactoryMethod;

public class AppleFactory implements Factory {

    @Override
    public Phone makePhone() {
        return new Apple();
    }
}
