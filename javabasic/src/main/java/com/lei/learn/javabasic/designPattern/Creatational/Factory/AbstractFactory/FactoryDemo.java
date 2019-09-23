package com.lei.learn.javabasic.designPattern.Creatational.Factory.AbstractFactory;

public class FactoryDemo {
    public static void main(String[] args) {

        AppleFactory appleFactory = new AppleFactory();
        Phone iPhone = appleFactory.makePhone();
        Headset airPod = appleFactory.makeHeadset();

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Phone huaWei = huaWeiFactory.makePhone();
        Headset huaWeiHeadset = huaWeiFactory.makeHeadset();

        iPhone.getName();
        airPod.getName();
        huaWei.getName();
        huaWeiHeadset.getName();
    }
}
