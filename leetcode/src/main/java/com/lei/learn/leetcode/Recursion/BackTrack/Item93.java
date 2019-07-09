package com.lei.learn.leetcode.Recursion.BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Item93 {

  public List<String> restoreIpAddresses(String s) {
    List<String> res = new ArrayList<>();
    backTrack(res, s, 0, "");
    return res;
  }

  private void backTrack(List<String> res, String s, int n, String ip) {
    if (n == 4) {
      res.add(ip);
    } else {
      String s1 = s.substring(0, 1);
    }
  }
}
