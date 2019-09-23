package com.lei.learn.javabasic.designPattern.Behavioral.Strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        XihongshiEgg xihongshiEgg = new XihongshiEgg();
        KitchenContext eggContext = new KitchenContext(xihongshiEgg);

        Yuxiangrousi yuxiangrousi = new Yuxiangrousi();
        KitchenContext rousiContext = new KitchenContext(yuxiangrousi);
        eggContext.cookingJiaoTou();
        rousiContext.cookingJiaoTou();
    }
}
