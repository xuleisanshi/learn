package com.lei.learn.leetcode.Stack;

import java.util.Stack;

public class Item150 {

    public static int evalRPN(String[] tokens) {

        if (tokens.length == 1) {
            return (int) new Integer(tokens[0]);
        }
        int result = 0, v1, v2;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {

            switch (tokens[i]) {
                case "+":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    result = v2 + v1;
                    stack.push(result);
                    break;
                case "-":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    result = v2 - v1;
                    stack.push(result);
                    break;
                case "*":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    result = v2 * v1;
                    stack.push(result);
                    break;
                case "/":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    result = v2 / v1;
                    stack.push(result);
                    break;
                default:
                    stack.push(new Integer(tokens[i]));
            }

        }

        return result;
    }

    public static void main(String[] args) {

        String[] tokens = new String[]{"4", "13", "5", "/", "+"};

        System.out.println(evalRPN(tokens));

    }

}
