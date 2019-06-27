package com.lei.learn.leetcode.Stack;

import java.util.Stack;

public class Item71 {

    public static String simplifyPath(String path) {

        String[] strings = path.split("/");

        Stack<String> stringStack = new Stack<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("") || strings[i].equals(".")) {
                continue;
            } else if (strings[i].equals("..")) {
                if (!stringStack.empty()) {
                    stringStack.pop();
                    continue;
                }
            } else {
                stringStack.push(strings[i]);
            }
        }
        

        if (stringStack.empty()) {
            return "/";
        }

        String result = "";

        while (!stringStack.empty()) {
            result = "/" + stringStack.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {

        String path = "/";

        System.out.println(simplifyPath(path));

    }
}
