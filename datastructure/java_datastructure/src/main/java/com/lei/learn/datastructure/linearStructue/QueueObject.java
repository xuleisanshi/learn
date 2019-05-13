package com.lei.learn.datastructure.linearStructue;

public class QueueObject<E> {

  E[] elements = (E[]) new Object[0];

  public QueueObject() {
  }

  /**
   * add a element to this queue
   *
   * @param element
   */
  public void add(E element) {
    E[] temp = (E[]) new Object[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      temp[i] = elements[i];
    }
    temp[elements.length] = element;
    elements = temp;
  }

  /**
   * poll the first element in the queue
   *
   * @return
   */
  public E poll() {
    if (elements.length == 0) {
      throw new RuntimeException("this is stack is empty");
    }
    E headElement = elements[0];
    E[] temp = (E[]) new Object[elements.length - 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = elements[i + 1];
    }
    elements = temp;
    return headElement;
  }

  /**
   * get the size of the queue
   *
   * @return
   */
  public int getSize() {
    return elements.length;
  }

  /**
   * is this queue empty
   *
   * @return
   */
  public boolean isEmpty() {
    return elements.length == 0;
  }
}