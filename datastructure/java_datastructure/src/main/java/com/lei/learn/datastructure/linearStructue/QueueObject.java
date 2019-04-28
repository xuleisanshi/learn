package com.lei.learn.datastructure.linearStructue;

public class QueueObject extends RuntimeException {

  String[] elements;

  public QueueObject() {
    this.elements = new String[0];
  }

  //TODO add
  public void add(String element) {
    String[] temp = new String[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      temp[i] = elements[i];
    }
    temp[elements.length] = element;
    elements = temp;
  }

  //TODO poll
  public String poll() {
    if (elements.length == 0) {
      throw new RuntimeException("this is stack is empty");
    }
    String headElement = elements[0];
    String[] temp = new String[elements.length - 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = elements[i + 1];
    }
    elements = temp;
    return headElement;
  }

  //todo length
  public int getSize() {
    return elements.length;
  }

  //TODO isEmpty
  public boolean isEmpty() {
    return elements.length == 0;
  }
}