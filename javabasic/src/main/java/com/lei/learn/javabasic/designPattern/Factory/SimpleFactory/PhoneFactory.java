package com.lei.learn.javabasic.designPattern.Factory.SimpleFactory;

public class PhoneFactory {//工厂类

    public static Phone makePhone(String phone) {
        if ("Apple".equals(phone)) {
            return new Apple();
        } else if ("HuaWei".equals(phone)) {
            return new HuaWei();
        } else {
            return null;
        }
    }

    public static Object makePhone2(Class<? extends Phone> clazz) {
        Object object = null;
        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
