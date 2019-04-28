package com.lei.learn.datastructure.linearStructue;

public class StackObject extends RuntimeException {
  private String[] elements = new String[0];

  public StackObject() {

  }

  //TODO push a new element
  public void push(String element) {
    String[] temp = new String[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      temp[i] = elements[i];
    }
    temp[elements.length] = element;
    elements = temp;
  }

  //TODO pop the top element and remove it
  public String pop() {
    if (elements.length == 0) {
      throw new RuntimeException("this is stack is empty");
    }
    String topElement = elements[elements.length - 1];
    String[] temp = new String[elements.length - 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = elements[i];
    }
    elements = temp;
    return topElement;
  }

  //TODO Is this stack empty
  public boolean isEmpty() {
    return elements.length == 0;
  }

  //TODO get the top of the stack
  public String top() {
    if (elements.length == 0) {
      throw new RuntimeException("this is stack is empty");
    }
    return elements[elements.length - 1];
  }
}
