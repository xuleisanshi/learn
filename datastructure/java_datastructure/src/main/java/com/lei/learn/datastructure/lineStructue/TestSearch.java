package com.lei.learn.datastructure.lineStructue;

public class TestSearch {

  public static void main(String[] args) {

    int[] targetArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    int targetElement = 6;
    int index = -1;
    //linear search
    for (int i = 0; i < targetArray.length; i++) {
      if (targetArray[i] == targetElement) {
        index = i;
        break;
      }
    }
    System.out.println(index);

    targetElement = 8;
    //binary search, a sorted array will have a good performance
    int beginIndex = 0;
    int endIndex = targetArray.length;
    int midIndex = (beginIndex + endIndex) / 2;
    while (true) {
      if (targetArray[midIndex] == targetElement) {
        index = midIndex;
        break;
      } else if (targetArray[midIndex] > targetElement) {
        endIndex = midIndex-1;
        midIndex = (endIndex+beginIndex) / 2;
      } else {
        beginIndex = midIndex+1;
        midIndex = (beginIndex + endIndex) / 2;
      }
    }
    System.out.println(index);
  }
}
