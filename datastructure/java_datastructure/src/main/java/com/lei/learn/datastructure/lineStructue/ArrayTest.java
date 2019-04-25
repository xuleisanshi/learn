package com.lei.learn.datastructure.lineStructue;

import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) {

    int []a = new int[0];
    System.out.println(a.length);
    // Test array object

    ArrayObject arrayObject = new ArrayObject();
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
//    System.out.println(Arrays.toString(arrayObject.delete(6)));
    System.out.println(Arrays.toString(arrayObject.insert(6,6)));

    System.out.println(arrayObject.linearSearch(6));
    System.out.println(arrayObject.binarySearch(10));

    //    int[] arr1 = new int[3];
    //    int[] arr2 = {1, 2, 3, 4, 5};
    //    arr1[0] = 1;
    //    arr1[1] = 2;
    //    arr1[2] = 3;
    //
    //    System.out.println(arr1[0]);
    //    for (int i = 0; i < arr1.length; i++) {
    //      System.out.println(arr1[i]);
    //    }
    //
    //    System.out.println("===============");
    //    for (int i = 0; i < arr2.length; i++) {
    //      System.out.println(arr2[i]);
    //    }
    //    int[] arr3 = new int[]{1, 2, 3};
    //    System.out.println("----------" + arr3[2]);
    //
    //    //add a new element to a array
    //    int[] array1 = new int[]{1, 2, 3, 6, 7, 8, 8, 0};
    //    int[] array2 = new int[array1.length + 1];
    //    int newElement = 4;
    //    for (int i = 0; i < arr1.length; i++) {
    //      array2[i] = array1[i];
    //    }
    //    array2[array1.length] = newElement;
    //
    //    System.out.println(Arrays.toString(array2));
    //
    //    int[] array3 = new int[array1.length - 1];
    //    int index = 3;
    //    for (int i = 0; i < array3.length; i++) {
    //      if (i < 3) {
    //        array3[i] = array1[i];
    //      } else {
    //        array3[i] = array1[i + 1];
    //      }
    //    }
    //    System.out.println(Arrays.toString(array3));
    //
    //
  }
}