package com.lei.learn.javabasic.basic;

public class integerTest {

    /**
     * autoboxing & unboxing
     */
    public static void main(String[] args) {
        Integer integer = 10; //autoboxing
        Integer integer1 = 10; //autoboxing


        Integer integer2 = integer + integer1;

        //（2）任何含有null值的包装类在自动拆箱成基本数据类型时都会抛出一个空指针异常
        Integer integer3 = null;
        int i1 = integer3;//空指针异常

        int i = integer;//unboxing

    }


}
