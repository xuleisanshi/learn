package com.lei.learn.datastructure.lineStructue;

public class ArrayTest{

  public  static void  main(String []args){
    int [] arr1= new int[3];
    int [] arr2 = {1,2,3,4,5};
    arr1[0]=1;
    arr1[1]=2;
    arr1[2]=3;

    System.out.println(arr1[0]);
    for (int i = 0 ;i < arr1.length;i++){
       System.out.println(arr1[i]);
    }

    System.out.println("===============");
    for (int i = 0 ;i < arr2.length;i++){
      System.out.println(arr2[i]);
    }
    int [] arr3 = new int[]{1,2,3};
    System.out.println("----------"+arr3[2]);

  }
}