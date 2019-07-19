package com.lei.learn.leetcode.HackerRank;

public class Operation {

    public static void main(String[] args) {
        double meal_cost = 10.25;
        int tip_percent = 17;
        int tax_percent = 5;

        double tax = meal_cost * (tip_percent + tax_percent) / 100;
        double result = meal_cost + tax;
        System.out.println(result);
        int vaule = (int) Math.round(result);

        System.out.println(vaule);

    }
}

