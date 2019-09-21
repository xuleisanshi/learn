package com.lei.learn.javabasic.designPattern.Behavioral.Template;

public abstract class CookingNoodles {
    boolean isBanNoodles = false;

    void prepareJiaoTou(String jiaotou) {
        System.out.println("浇头： " + jiaotou);
    }

    void cookingNoodles(String noodles) {
        System.out.println("面条： " + noodles);

    }

    //定义为保户类型，对外不可见这个方法
    protected void hook() {
        //空实现，给子类留有可扩展的余地
    }

    boolean isHook() {
        return false;
    }

    CookingNoodles cooking(String jiaoTou, String noodles) {

        prepareJiaoTou(jiaoTou);
        cookingNoodles(noodles);
        if (isHook()) {
            hook();
        }
        return this;
    }
}
