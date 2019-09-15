package com.lei.learn.javabasic.advance;

public class CallBackDemo {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(args.length);
            System.out.println(s);
        }
        Boss boss = new Boss();
        boss.bookFlyTicket("", new Employee());


    }
}
