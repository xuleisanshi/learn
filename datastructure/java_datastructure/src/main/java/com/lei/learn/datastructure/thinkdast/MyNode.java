package com.lei.learn.datastructure.thinkdast;

public class MyNode<E> {
  public E object;
  public MyNode next;

  public MyNode(E object) {
    this.object = object;
    this.next = null;
  }

  public MyNode() {
    this.object = null;
    this.next = null;
  }

  public void setObject(E object) {
    this.object = object;
  }

  public MyNode getNext() {
    return next;
  }

  public void setNext(MyNode next) {
    this.next = next;
  }

  public E getObject() {
    return this.object;
  }
}
