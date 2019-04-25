package com.lei.learn.datastructure.linearStructue;

public class StackTest {
  public static void main(String[] args) {
    StackObject stackObject = new StackObject();
    stackObject.push("a");
    stackObject.push("b");
    System.out.println(stackObject.pop());
    System.out.println(stackObject.pop());
  }
}
