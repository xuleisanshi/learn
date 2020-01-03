package com.lei.learn.datastructure.thinkdast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

  private int size;
  private T[] array;

  public MyArrayList() {
    this.array = (T[]) new Object[10];
    size = 0;
  }

  @Override
  public int size() {
    return this.size;
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
  public Iterator<T> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T1> T1[] toArray(T1[] a) {
    return null;
  }

  @Override
  public boolean add(T element) {
    if (!(size < array.length)) {
      extendArray();
    }
    array[size] = element;
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
  public boolean addAll(Collection<? extends T> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends T> c) {
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
  public T get(int index) {
    if (index > size) {
      throw new ArrayIndexOutOfBoundsException();
    }

    return array[index];
  }

  @Override
  public T set(int index, T element) {

    T old = get(index);
    array[index] = element;

    return old;
  }

  @Override
  public void add(int index, T element) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    if (size + 1 > array.length) {
      extendArray();
    }
    System.arraycopy(array, index, array, index + 1, size - index);
    array[index] = element;
  }

  private void extendArray() {
    T[] newArray = (T[]) new Object[2 * array.length];
    System.arraycopy(array, 0, newArray, 0, array.length);
    array = newArray;
  }

  @Override
  public T remove(int index) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    T result = array[index];
    System.arraycopy(array, index + 1, array, index, size - index - 1);
    array[--size] = null;
    return result;
  }

  @Override
  public int indexOf(Object o) {
    int result = -1;
    for (int index = 0; index < size; index++) {
      if (equals(array[index], o)) {
        result = index;
        break;
      }
    }
    return result;
  }

  private boolean equals(T target, Object element) {
    if (target == null) {
      return element == null;
    } else {
      return target.equals(element);
    }
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<T> listIterator() {
    return null;
  }

  @Override
  public ListIterator<T> listIterator(int index) {
    return null;
  }

  @Override
  public List<T> subList(int fromIndex, int toIndex) {
    return null;
  }
}
