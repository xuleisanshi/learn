package com.lei.learn.javabasic.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {


    public static void main(String[] args) {

        String[] names = {"1", "2", "3", "4"};
        List<String> arrayList = Arrays.asList(names);
        arrayList.forEach(System.out::println);

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 1);
        map.put("d", 1);
        map.put("e", 1);

        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
        map.keySet().forEach(System.out::println);

    }
}
