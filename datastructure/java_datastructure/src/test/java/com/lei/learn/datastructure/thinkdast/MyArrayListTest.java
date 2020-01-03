package com.lei.learn.datastructure.thinkdast;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MyArrayListTest {

  private List<Integer> myArrayList = new MyArrayList<>();

  @Before
  public void setUp() {
    myArrayList.add(0);
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
  }

  @Test
  public void testMyList() {
    assertThat(myArrayList.size(), is(4));
  }

  @Test
  public void testAddAnElement() {
    myArrayList.add(4);
    assertThat(myArrayList.size(), is(5));
    assertThat(myArrayList.get(4), is(4));
  }

  @Test
  public void testGetAnExistingElement() {
    Integer val = myArrayList.get(1);
    assertThat(val, is(1));
  }

  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void testGetAnOutOfBoundsElement1() {
    myArrayList.get(-1);
  }

  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void testGetAnOutOfBoundsElement() {
    myArrayList.get(5);
  }

  @Test
  public void testSetAnElementAtPosition() {
    myArrayList.set(1, new Integer(8));
    assertThat(myArrayList.get(1), is(8));

    try {
      myArrayList.set(-1, 0);
      fail();
    } catch (IndexOutOfBoundsException e) {
    } // good
    try {
      myArrayList.set(8, 8);
      fail();
    } catch (IndexOutOfBoundsException e) {
    }
  }

  @Test
  public void testIndexOfAnElement() {
    assertThat(myArrayList.indexOf(1), is(1));
    assertThat(myArrayList.indexOf(16), is(-1));
  }

  @Test
  public void testAddAnElementAtPosition() {
    myArrayList.add(1, 11);
    assertThat(myArrayList.get(1), is(11));
    assertThat(myArrayList.get(4), is(3));
    try {
      myArrayList.add(-1, -1);
      fail();
    } catch (ArrayIndexOutOfBoundsException e) {

    }
    try {
      myArrayList.add(100, 100);
      fail();
    } catch (ArrayIndexOutOfBoundsException e) {

    }
  }

  @Test
  public void testRemoveAnElementByIndex() {
    myArrayList.remove(1);
    assertThat(myArrayList.size(), is(3));
    assertThat(myArrayList.get(1), is(2));
    try {
      myArrayList.get(4);
      fail();
    } catch (ArrayIndexOutOfBoundsException e) {
    }
    try {
      myArrayList.remove(-1);
      fail();
    } catch (ArrayIndexOutOfBoundsException e) {
    }

    try {
      myArrayList.remove(8);
      fail();
    } catch (ArrayIndexOutOfBoundsException e) {
    }
  }

}

