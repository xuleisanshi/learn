package com.lei.learn.javabasic.designPattern.Behavioral.Observer;

public interface Kitchen {

    void attach(Diners diners);

    void detach(Diners diners);

    void update();
}
