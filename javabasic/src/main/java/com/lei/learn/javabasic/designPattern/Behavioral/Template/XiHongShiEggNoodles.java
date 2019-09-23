package com.lei.learn.javabasic.designPattern.Behavioral.Template;

public class XiHongShiEggNoodles extends CookingNoodles {
    @Override
    boolean isHook() {
        return true;
    }

    @Override
    public void hook() {
        System.out.println("钩子： 汤面");
    }

    @Override
    CookingNoodles cooking(String jiaotou, String noodles) {
        return super.cooking(jiaotou, noodles);
    }
}
