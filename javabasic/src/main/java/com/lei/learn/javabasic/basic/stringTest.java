package com.lei.learn.javabasic.basic;

public class stringTest {

  public static void main(String[] args) {

    //        char a = 'a';
    //        String b = "a";
    //
    //
    //        System.out.println("=======char========");
    //        System.out.println(a);
    //        System.out.println(a + 0);
    //
    //        System.out.println("=======String========");
    //        System.out.println(b);
    //        System.out.println(b.hashCode());
    //        System.out.println(b.getBytes());
    //        System.out.println(b.intern());

    String a = "ghg";
    String b = "ghg";
    System.out.println(b.hashCode());
    System.out.println(a.hashCode());
    a = a + "aefaer";
    System.out.println(a.hashCode());
  }
}
