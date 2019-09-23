package com.lei.learn.javabasic.designPattern.Behavioral.Strategy;

public class KitchenContext {
    private JiaoTou jiaoTou;

    public KitchenContext(JiaoTou jiaoTou) {
        this.jiaoTou = jiaoTou;
    }


    public void cookingJiaoTou() {
        jiaoTou.cookingJiaoTou();
    }

}
