package com.lei.learn.leetcode.CollectionLearn;

import java.util.HashMap;
import java.util.Map;

public class setmap {

    public static void main(String[] args) {

//        Set<Integer> ints = new HashSet<>();
//
//        ints.add(1);
//        System.out.println(ints.contains(1));
//        System.out.println(ints.size());
//        System.out.println(ints.remove(1));

        Map<Integer, String> integerIntegerMap = new HashMap<>();
        System.out.println(integerIntegerMap.put(1, "a"));
        System.out.println(integerIntegerMap.put(2, "b"));
        System.out.println(integerIntegerMap.get(1) + 1);
        System.out.println(integerIntegerMap.entrySet());
        System.out.println(((HashMap<Integer, String>) integerIntegerMap).clone());
        System.out.println(integerIntegerMap.containsValue("a"));
        System.out.println(integerIntegerMap.keySet());
        System.out.println(integerIntegerMap.values());

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(1, map.get(1) + 1);
        System.out.println(map.get(1));


    }
}
