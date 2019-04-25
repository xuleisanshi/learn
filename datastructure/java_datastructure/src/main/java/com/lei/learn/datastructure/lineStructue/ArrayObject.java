package com.lei.learn.datastructure.lineStructue;

import java.util.Arrays;

public class ArrayObject extends RuntimeException {
  private int[] elements;

  public ArrayObject() {
    this.elements = new int[0];
  }

  //add
  public int[] add(int element) {
    int[] tmpElements = new int[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      tmpElements[i] = elements[i];
    }
    tmpElements[elements.length] = element;
    elements = tmpElements;
    return elements;
  }

  //print all the element
  public void show() {
    System.out.println(Arrays.toString(elements));
  }

  //length
  public int size() {
    return this.elements.length;
  }

  //get one element, according the index
  public int get(int index) {
    return elements[index - 1];
  }

  //delete, exception out of length

  public int[] delete(int index) {
    if (index < 0 || index > elements.length) {
      throw new RuntimeException("This index is out of bround!");
    }
    int[] tmp = new int[elements.length - 1];
    for (int i = 0; i < tmp.length; i++) {
      if (i < index) {
        tmp[i] = elements[i];
      } else {
        tmp[i] = elements[i + 1];
      }
    }
    elements = tmp;
    return elements;
  }

  //insert a element tot a specific index
  public int[] insert(int index, int element) {
    int[] tmp = new int[elements.length + 1];
    for (int i = 0; i < tmp.length; i++) {
      if (i < index) {
        tmp[i] = elements[i];
      } else if (i == index) {
        tmp[i] = element;
      } else {
        tmp[i] = elements[i - 1];
      }
    }
    elements = tmp;
    return elements;
  }

  public int linearSearch(int targetElement) {
    int index = -1;
    for (int i = 0; i < elements.length; i++) {
      if (elements[i] == targetElement) {
        index = i;
        break;
      }
    }
    return index;
  }

  public int binarySearch(int targetElement) {
    int index = -1;
    int beginIndex = 0;
    int endIndex = elements.length;
    //TODO element should be sorted ascending
    int midIndex = (beginIndex + endIndex) / 2;
    // the condition to end the loop
    while (beginIndex < endIndex) {
      if (elements[midIndex] == targetElement) {
        index = midIndex;
        break;
      } else if (elements[midIndex] > targetElement) {
        endIndex = midIndex - 1;
        midIndex = (endIndex + beginIndex) / 2;
      } else {
        beginIndex = midIndex + 1;
        midIndex = (beginIndex + endIndex) / 2;
      }
    }
    return index;
  }
}
