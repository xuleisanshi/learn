package com.lei.learn.leetcode.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumber {
  public static void main(String []argh){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer> maps = new HashMap<>();
    for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      maps.put(name,phone);
      // Write code here
    }
    while(in.hasNext()){
      String s = in.next();
      // Write code here
      if(!maps.containsKey(s)){
        System.out.println("Not found");
      }else{
        System.out.println(s+"="+maps.get(s));
      }
    }
    in.close();
  }
}