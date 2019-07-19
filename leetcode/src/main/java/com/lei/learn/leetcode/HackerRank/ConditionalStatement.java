package com.lei.learn.leetcode.HackerRank;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s= ( n % 2 == 1 || n > 5 && n <= 20 ? "Weird" : "Not Weird" );
        System.out.println(s);
        scanner.close();
    }
}
