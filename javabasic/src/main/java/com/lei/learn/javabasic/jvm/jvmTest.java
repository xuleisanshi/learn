package com.lei.learn.javabasic.jvm;

class Person {

    private Long id;
    private String name;

    private static String country;
}

public class jvmTest {

    public static void main(String[] args) {
        //存放在常量池中
        String a = "hello";
        //去常量池中查找，若存在则直接引用，若不存在，则在常量池中新建。
        String b = "hello";//常量池
        String b1 = new String("hello");//堆内存中
        String c = b1.intern();//存在于堆常量池中

        System.out.println("========字符串常量池========");
        System.out.println(b1 == c);//false
        System.out.println(c == a);//true
        System.out.println(b1.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a == b);//a, b 均指向常量池中，a，b作为变量，存储在栈中,指向的值存在于常量池中。
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println("======拼接=========");

        String str1 = "hello";//常量池
        String str2 = "world";//常量池

        String str3 = str1 + str2;//堆上的对象
        String string4 = "hello" + "world";//常量池

        System.out.println(String.valueOf(string4));
        System.out.println(string4);

        System.out.println(str3 == string4);//要避免字符串的拼接，字符串的拼接会产生新的对象


        //基本类型

        System.out.println("======基本数据类型=========");
        /**
         * 实现了常量池技术的基本类型包装类，缓存数据区间是[-128,127]
         * Byte
         * Short
         * Integer
         * Long
         * Character
         * Boolean
         */
        Integer integer1 = 1;
        Integer integer2 = 1;
        System.out.println(integer1 == integer2);//常量池中
        Integer integer3 = 128;
        Integer integer4 = 128;
        System.out.println(Integer.valueOf(128));
        System.out.println(integer3);
        System.out.println(integer3 == integer4);//false, Integer d区间是[-128,127]

        /**
         * 未实现常量池技术
         * Float
         * Double
         */

        Float f1 = new Float(1);
        Float f2 = new Float(1);
        System.out.println(f1);
        System.out.println(f1 == f2);

    }
}
