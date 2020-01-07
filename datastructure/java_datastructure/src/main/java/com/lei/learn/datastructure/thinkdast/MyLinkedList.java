package com.lei.learn.datastructure.thinkdast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
  private int size;
  private MyNode head;

  public MyLinkedList() {
    this.head = null;
    this.size = 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(E e) {
    if (head == null) {
      head = new MyNode(e);
    } else {
      MyNode cursorNode = head;
      while (cursorNode.next != null) {
        cursorNode = cursorNode.next;
      }
      cursorNode.next = new MyNode(e);
    }
    size++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public E get(int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }
    MyNode cursorNode = head;
    while (index-- != 0) {
      cursorNode = cursorNode.next;
    }

    return (E) cursorNode.getObject();
  }

  @Override
  public E set(int index, E element) {
    return null;
  }

  @Override
  public void add(int index, E element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }
    MyNode cursorNode = new MyNode();
    cursorNode.next = head;
    for (int i = 0; i <= index; i++) {
      if (i == index) {
      }
    }
  }

  @Override
  public E remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    MyNode cursorNode = head;
    for (int i = 0; i < size; i++) {
      if (equals(cursorNode.getObject(), o)) {
        return i;
      }
      cursorNode = cursorNode.next;
    }
    return -1;
  }

  private boolean equals(Object targetObject, Object newObject) {
    if (targetObject == null) {
      return newObject == null;
    } else {
      return targetObject.equals(newObject);
    }
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<E> listIterator() {
    return null;
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    return null;
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    return null;
  }
}
