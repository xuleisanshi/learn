package com.lei.learn.javabasic.collection;

public class arrayTest {

  private String a;
  private int b;

  public static void main(String[] args) {
    String a = "asd";
    String b = new String("asd");

    Double d = 1.0;
    int i1 = 12;
    int i2 = 13;
    int i3 = 12;
    int i4 = 13;

    int i5 = add(i1, i2);
  }

  public static int add(int a, int b) {
    int r = a + b;
    return r;
  }
}
