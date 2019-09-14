package com.lei.learn.javabasic.advance;

public class CallBackDemo {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.bookFlyTicket("", new Employee());
    }
}
