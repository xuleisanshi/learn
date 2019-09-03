package com.lei.learn.javabasic.basic;

public class staticTest {

    private static void Print() {
        System.out.println("Print()");
    }

    public static void main(String[] args) {

        /**
         * null可以转为任意一种类型
         * 此处由于Print是静态方法， 静态方法是跟着class走的，class加载的时候就为print分配了内存空间
         * 而非静态方法则是跟着对象的，当对象实例化的时候才分配内存空间，因此此处输出Print()
         */
        ((staticTest)null).Print();
    }
}
