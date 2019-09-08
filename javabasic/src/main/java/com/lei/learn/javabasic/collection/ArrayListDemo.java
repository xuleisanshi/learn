package com.lei.learn.javabasic.collection;

import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");

        System.out.println(arrayList.get(1));
        String[] strings1 = arrayList.toArray(new String[0]);
        System.out.println(strings1[0]);
        String[] strings = new String[1];
        strings = arrayList.toArray(strings);
        System.out.println(strings[0]);

    }
}
