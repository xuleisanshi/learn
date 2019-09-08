package com.lei.learn.javabasic.collection;

import org.h2.engine.User;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(2);

        hashMap.put(null, 1);//hashMap 可以用null为key
        hashMap.put("a", 1);//hashMap 可以用null为key
        hashMap.put("b", 1);//hashMap 可以用null为key


        System.out.println(hashMap.size());
        System.out.println(hashMap.toString());
    }
}
