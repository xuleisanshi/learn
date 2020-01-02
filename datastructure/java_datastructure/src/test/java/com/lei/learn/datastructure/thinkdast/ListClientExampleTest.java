package com.lei.learn.datastructure.thinkdast;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListClientExampleTest {

  @Test
  public void testArrayList() {
    ListClientExample lce = new ListClientExample();
    List list = lce.getList();
    assertThat(list, instanceOf(ArrayList.class));
  }
}
