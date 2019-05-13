package com.lei.learn.datastructure.linearStructue;

import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) {

    ArrayObject<Integer> arrayObject = new ArrayObject<>();
    arrayObject.add(1);
    arrayObject.add(2);
    arrayObject.add(3);
    arrayObject.add(4);
    arrayObject.add(5);
    arrayObject.add(6);
    arrayObject.add(7);
    arrayObject.add(8);
    arrayObject.add(9);
    arrayObject.show();
    System.out.println(arrayObject.size());
    //System.out.println(Arrays.toString(arrayObject.delete(6)));
    System.out.println(Arrays.toString(arrayObject.insert(6, 6)));

    System.out.println(arrayObject.linearSearch(6));
    //System.out.println(arrayObject.binarySearch(10));
  }
}