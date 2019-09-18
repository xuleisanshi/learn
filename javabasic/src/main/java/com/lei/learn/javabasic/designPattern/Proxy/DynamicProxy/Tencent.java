package com.lei.learn.javabasic.designPattern.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * proxy for game
 */
public class Tencent implements InvocationHandler {
    private Object proxied;

    public Tencent(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        login();
        Object object = method.invoke(proxied, args);
        logout();
        return null;
    }


    private void login() {
        System.out.println("Login Game");
    }

    private void logout() {
        System.out.println("Logout Game");
    }

}
