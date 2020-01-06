package com.lei.learn.datastructure.thinkdast;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MyNodeTest {

  public MyNode<Integer> myNode = new MyNode<>();

  @Before
  public void setUp() {
    myNode.object = new Integer(0);
    myNode.next = new MyNode(1);
  }

  @Test
  public void testMyNode() {
    assertThat(myNode.next.object, is(1));
    assertNull(myNode.next.next );
  }
}
