package com.lei.learn.datastructure.linearStructue;

public class StackObject<E> {
  private E[] elements = (E[]) new Object[0];

  public StackObject() {

  }

  /**
   * push a new element to a stack
   *
   * @param element
   */
  public void push(E element) {
    E[] temp = (E[]) new Object[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      temp[i] = elements[i];
    }
    temp[elements.length] = element;
    elements = temp;
  }

  /**
   * pop the top element and remove it.
   *
   * @return
   */
  public E pop() {
    if (elements.length == 0) {
      throw new RuntimeException("this is stack is empty");
    }
    E topElement = elements[elements.length - 1];
    E[] temp = (E[]) new Object[elements.length - 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = elements[i];
    }
    elements = temp;
    return topElement;
  }

  /**
   * is the stack empty
   *
   * @return
   */
  public boolean isEmpty() {
    return elements.length == 0;
  }

  //TODO get the top of the stack

  /**
   * get the top of the stack
   *
   * @return
   */
  public E top() {
    if (elements.length == 0) {
      throw new RuntimeException("this is stack is empty");
    }
    return elements[elements.length - 1];
  }
}
