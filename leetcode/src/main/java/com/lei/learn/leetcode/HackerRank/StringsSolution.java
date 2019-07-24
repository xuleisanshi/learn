package com.lei.learn.leetcode.HackerRank;

import java.util.Scanner;

public class StringsSolution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
    named Solution. */
    Scanner scanner = new Scanner(System.in);
    int myInt = scanner.nextInt();
    String[] strings = new String[myInt+1];
    for (int i = 0; i < strings.length; i++) {
      strings[i] = scanner.nextLine();
      scanner
    }
    for (int i = 1; i < strings.length; i++) {
      reView(strings[i]);
    }
    scanner.close();
  }

  private static void reView(String myString) {
    String odd = "";
    String even = "";
    for (int i = 0; i < myString.length(); i++) {
      if (i % 2 == 1) {
        even = even + myString.charAt(i);
      } else {
        odd = odd + myString.charAt(i);
      }
    }
    System.out.println(odd + "  " + even);
  }
}

