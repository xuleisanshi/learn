package com.lei.learn.javabasic.advance;

import net.sf.cglib.asm.$Attribute;

public class Employee {
    void bookFlyTicket(CallBackService callBackService) {
        System.out.println("Employee book a ticket");
        callBackService.update(null);
    }

}
