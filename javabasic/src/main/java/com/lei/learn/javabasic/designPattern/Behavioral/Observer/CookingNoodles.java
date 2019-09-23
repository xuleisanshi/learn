package com.lei.learn.javabasic.designPattern.Behavioral.Observer;

import java.util.HashSet;
import java.util.Set;

public class CookingNoodles implements Kitchen {

    private Set<Diners> dinersSet = new HashSet<>();

    @Override
    public void attach(Diners diners) {
        dinersSet.add(diners);
    }

    @Override
    public void detach(Diners diners) {
        dinersSet.remove(diners);
    }

    @Override
    public void update() {
        dinersSet.forEach(diners -> {
            System.out.println();
            diners.eat();
        });
    }
}
