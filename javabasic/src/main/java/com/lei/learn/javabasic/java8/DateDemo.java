package com.lei.learn.javabasic.java8;

import java.time.Clock;
import java.time.ZoneId;
import java.util.Date;

public class DateDemo {


    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();

        System.out.println(c.getZone());
        System.out.println(c.instant());
        System.out.println(c.millis());
        System.out.println(new Date());
        System.out.println(Date.from(c.instant()));

        System.out.println(ZoneId.getAvailableZoneIds());
    }
}
