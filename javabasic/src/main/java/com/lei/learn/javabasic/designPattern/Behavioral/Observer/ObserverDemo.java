package com.lei.learn.javabasic.designPattern.Behavioral.Observer;

public class ObserverDemo {

    public static void main(String[] args) {

        CookingNoodles cookingNoodles = new CookingNoodles();
        DinerA zhangsan = new DinerA("zhangsan");
        DinerA lisi = new DinerA("lisi");
        cookingNoodles.attach(zhangsan);
        cookingNoodles.attach(lisi);
        cookingNoodles.update();
    }
}
