package com.lei.learn.leetcode.Stack;

import java.util.Stack;

public class Item20 {

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char tmp;
                switch (chars[i]) {
                    case ')':
                        tmp = '(';
                        break;
                    case ']':
                        tmp = '[';
                        break;
                    default:
                        tmp = '{';
                }
                if (tmp != stack.pop()) {
                    return false;
                }
            }
        }
        if (stack.empty())
            return true;
        else return false;
    }

    public static void main(String[] args) {

        String s = "";
        System.out.println(isValid(s));

    }
}
