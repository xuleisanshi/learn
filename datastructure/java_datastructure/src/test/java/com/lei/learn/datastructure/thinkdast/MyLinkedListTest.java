package com.lei.learn.datastructure.thinkdast;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.typeCompatibleWith;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {

  private MyLinkedList<Integer> list = new MyLinkedList<>();

  @Before
  public void setUp() {
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
  }

  @Test
  public void testMyLinkedList() {
    assertThat(list, instanceOf(MyLinkedList.class));
    assertThat(list.size(), is(4));
  }

  @Test
  public void testAddAnElement() {
    assertTrue(list.add(4));
  }

  @Test
  public void testGetAnElement() {
    assertThat(list.get(1), is(1));
    System.out.println(list.size());
    try {
      list.get(-1);
      fail();
    } catch (IndexOutOfBoundsException e) {

    }
    try {
      list.get(100);
      fail();
    } catch (IndexOutOfBoundsException e) {

    }
  }

  @Test
  public void testIndexOf() {
    assertThat(list.indexOf(1), is(1));
    assertThat(list.indexOf(11), is(-1));
  }

  @Test
  public void testAddAnElementToPosition() {
    try {
      list.add(-1, -1);
      fail();
    } catch (IndexOutOfBoundsException e) {

    }

    list.add(1,11);
    assertThat(list.get(1),is(11));
  }
}
