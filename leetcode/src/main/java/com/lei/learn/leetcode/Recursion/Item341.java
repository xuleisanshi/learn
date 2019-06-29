package com.lei.learn.leetcode.Recursion;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Item341 {

  public interface NestedInteger {

    boolean isInteger();

    Integer getInteger();

    List<NestedInteger> getList();
  }

  public class NestedIterator implements Iterator<Integer> {

    private List<Integer> flattenedList;
    private Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedList) {
      flattenedList = new LinkedList<Integer>();
      flatten(nestedList);
      it = flattenedList.iterator();
    }

    private void flatten(List<NestedInteger> nestedList) {
      for (NestedInteger i : nestedList) {
        if (i.isInteger()) {
          flattenedList.add(i.getInteger());
        } else {
          flatten(i.getList());
        }
      }
    }

    @Override
    public Integer next() {
      return it.next();
    }

    @Override
    public boolean hasNext() {
      return it.hasNext();
    }
  }
}
