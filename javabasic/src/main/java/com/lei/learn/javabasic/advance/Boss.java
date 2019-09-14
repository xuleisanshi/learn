package com.lei.learn.javabasic.advance;

public class Boss implements CallBackService {

    public void bookFlyTicket(String string, Employee employee) {
        System.out.println("Boss let employee to book a ticket");
        employee.bookFlyTicket(this);
    }

    @Override
    public void update(String s) {
        System.out.println("after employee do something, update this information to boss");
    }
}
