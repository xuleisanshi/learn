package com.lei.learn.javabasic.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(2);

        hashMap.put(null, 1);//hashMap 可以用null为key
        hashMap.put("a", 1);//hashMap 可以用null为key
        hashMap.put("b", 2);//hashMap 可以用null为key

        System.out.println(hashMap.put("c", 3));
        System.out.println(hashMap.put("c", 4));
        System.out.println(hashMap.put("c", 5));
        System.out.println(hashMap);
        System.out.println("=========遍历hash map ============");
        Set<String> list = hashMap.keySet();
        for (String key : list) {
            System.out.print(hashMap.get(key) + " ");
        }

        Collection<Integer> list1 = hashMap.values();
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }


    }
}
