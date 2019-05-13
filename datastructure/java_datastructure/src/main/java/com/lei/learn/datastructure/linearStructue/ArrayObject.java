package com.lei.learn.datastructure.linearStructue;

import java.util.Arrays;

public class ArrayObject<E> {
  private E[] elements;

  public ArrayObject() {
    this.elements  = (E[])new Object[0];
  }

  /**
   * add
   *
   * @param element
   * @return
   */
  public E[] add(E element) {
    E[] tmpElements = (E[]) new Object[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      tmpElements[i] = elements[i];
    }
    tmpElements[elements.length] = element;
    elements = tmpElements;
    return elements;
  }

  /**
   * print all the element
   */
  public void show() {
    System.out.println(Arrays.toString(elements));
  }

  /**
   * length
   *
   * @return
   */
  public int size() {
    return this.elements.length;
  }

  /**
   * get one element, according the index
   *
   * @param index
   * @return
   */
  public E get(int index) {
    return elements[index - 1];
  }

  /**
   * delete, exception out of length
   *
   * @param index
   * @return
   */
  public E[] delete(int index) {
    if (index < 0 || index > elements.length) {
      throw new RuntimeException("This index is out of bround!");
    }
    E[] tmp = (E[]) new Object[elements.length - 1];
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

  /**
   * insert a element tot a specific index
   *
   * @param index
   * @param element
   * @return
   */
  public E[] insert(int index, E element) {
    E[] tmp = (E[]) new Object[elements.length + 1];
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

  /**
   * @param targetElement
   * @return
   */
  public int linearSearch(E targetElement) {
    int index = -1;
    for (int i = 0; i < elements.length; i++) {
      if (elements[i] == targetElement) {
        index = i;
        break;
      }
    }
    return index;
  }

  @Override
  public String toString() {
    return "ArrayObject{" + "elements=" + Arrays.toString(elements) + '}';
  }
  //  public int binarySearch(int targetElement) {
  //    int index = -1;
  //    int beginIndex = 0;
  //    int endIndex = elements.length;
  //    //TODO element should be sorted ascending
  //    int midIndex = (beginIndex + endIndex) / 2;
  //    // the condition to end the loop
  //    while (beginIndex < endIndex) {
  //      if (elements[midIndex] == targetElement) {
  //        index = midIndex;
  //        break;
  //      } else if (elements[midIndex]>targetElement) {
  //        endIndex = midIndex - 1;
  //        midIndex = (endIndex + beginIndex) / 2;
  //      } else {
  //        beginIndex = midIndex + 1;
  //        midIndex = (beginIndex + endIndex) / 2;
  //      }
  //    }
  //    return index;
  //  }
}
