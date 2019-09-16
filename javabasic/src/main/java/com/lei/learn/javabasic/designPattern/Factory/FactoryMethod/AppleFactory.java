package com.lei.learn.javabasic.designPattern.Factory.FactoryMethod;

public class AppleFactory implements Factory {

    @Override
    public Phone makePhone() {
        return new Apple();
    }
}
