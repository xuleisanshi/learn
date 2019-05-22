package com.lei.learn.leetcode.Array;

public class Item125 {

  public static boolean isPalindrome(String s) {
    boolean isPalindrome = false;
    char[] chars = s.toCharArray();
    int low = 0, high = chars.length - 1;
    while (low < high) {
      if (!Character.isLetterOrDigit(chars[low])) {
        low++;
        continue;
      }
      if (!Character.isLetterOrDigit(chars[high])) {
        high--;
        continue;
      }
      if (Character.toLowerCase(chars[low]) == Character.toLowerCase(chars[high])) {
        low++;
        high--;
      } else {
        break;
      }
    }
    if (low == high || (high + 1) == low) {
      isPalindrome = true;
    }
    return isPalindrome;
  }

  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }
}
