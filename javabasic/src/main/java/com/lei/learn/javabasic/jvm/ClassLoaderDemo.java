package com.lei.learn.javabasic.jvm;

public class ClassLoaderDemo {

  public static void main(String[] args) {

    System.out.println("ClassLoaderDemo is : " + ClassLoaderDemo.class.getClassLoader());
    System.out
        .println("ClassLoaderDemo is : " + ClassLoaderDemo.class.getClassLoader().getParent());
    System.out.println(
        "ClassLoaderDemo is : " + ClassLoaderDemo.class.getClassLoader().getParent().getParent());
  }
}
