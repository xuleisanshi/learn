package com.lei.learn.javabasic.basic;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1).setScale(1);
        BigDecimal b = new BigDecimal(0.9);
        BigDecimal c = new BigDecimal(0.8);

        System.out.println(a.subtract(b));
        BigDecimal d = a.subtract(b);
        BigDecimal e = b.subtract(c);

        System.out.println(d);
        System.out.println(d.setScale(3,BigDecimal.ROUND_HALF_DOWN));
        System.out.println(e);
    }
}
