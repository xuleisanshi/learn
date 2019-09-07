package com.lei.learn.javabasic.basic;

import java.util.Arrays;

public class varableDemo {

    public static class Demo {
        /**
         * 成员变量，属于类或者对象，存放在堆内存中
         * 可以被是public， private或者static的
         * 也可以是final的
         * <p>
         * 若static，则该变量则是属于类的，随着类的加载而初始化
         * 若没有static，则是属于对象的实例的，随着对象的实例化进行初始化
         */
        private final String s1 = "hello";
        private static final int i = 1;
        private String name;//

        public Demo() {

        }
    }

    /**
     * 局部变量，方法中定义，或者方法中的参数，存放在栈中
     * 局部变量不可以是static的方法
     * 可以final
     */
    public int add(int a, int b) {//a, b 局部变量
        final int c = 3;
        return a + b + c;
    }

    /**
     * 值传递
     *
     * @param
     */

    public static void method(int a) {
        a = 1;
        a++;
        System.out.println(a);

    }


    /**
     * 方法得到的是对象引用的拷贝，对象引用及其他的拷贝同时引用同一个对象。
     * @param a
     */
    public static void method(int[] a) {
        if (a.length > 0) {
            a[0] = 11;
        }
        System.out.println(Arrays.toString(a));

    }


    public static void main(String[] args) {
        /**
         * 对象引用存放在栈中
         * 对象存在于堆中
         */
        Demo demo;//创建对象引用
        Demo demo3;
        //new Demo(); 创建对象
        demo = new Demo();//创建对象，对象引用指向对象
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        demo3 = demo1;
        System.out.println(demo1.hashCode());
        System.out.println(demo2.hashCode());
        System.out.println(demo3.hashCode());

        System.out.println(demo1 == demo2);
        System.out.println(demo1 == demo3);
        demo3.equals(demo1);


        System.out.println("============值传递==========");

        int a = 11;
        method(a);
        System.out.println(a);

        int[] b = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(b));
        method(b);
        System.out.println(Arrays.toString(b));

    }

}
