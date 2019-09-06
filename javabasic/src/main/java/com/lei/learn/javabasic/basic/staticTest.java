package com.lei.learn.javabasic.basic;

import static java.lang.Float.min;
import static java.lang.Math.max;

public class staticTest {

    private static void Print() {
        System.out.println("Print()");
    }

    private String name;

    public static void main(String[] args) {

        /**
         * null可以转为任意一种类型
         * 此处由于Print是静态方法， 静态方法是跟着class走的，class加载的时候就为print分配了内存空间
         * 而非静态方法则是跟着对象的，当对象实例化的时候才分配内存空间，因此此处输出Print()
         */
        ((staticTest) null).Print();
        inner inn = new inner();
        inn.method();
        /**
         * 静态导包
         */
        min(1, 3);
        max(1, 3);
    }


    /**
     * 静态内部类
     */

    public static class inner {
        public String a;

        public void method() {
            System.out.println("静态内部类方法");
            staticTest.Print();
        }


    }
}
