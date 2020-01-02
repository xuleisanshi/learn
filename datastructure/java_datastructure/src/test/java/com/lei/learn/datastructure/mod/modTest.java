package com.lei.learn.datastructure.mod;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.lei.learn.datastructure.mod.Mod.Mod;
import org.junit.Test;

public class modTest {

  @Test
  public void testEqualMod() {
    Mod mod = new Mod();
    assertThat(mod.getResult(5, 2), is(mod.getResult(4, 3)));
  }

  @Test
  void testModAddSameValue() {
    Mod mod = new Mod();
  }
}
