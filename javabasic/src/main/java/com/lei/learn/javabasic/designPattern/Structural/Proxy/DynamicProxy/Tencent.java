package com.lei.learn.javabasic.designPattern.Structural.Proxy.DynamicProxy;

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

    /**
     *
     * @param proxy 代理类的代理的真实代理对象，$Proxy
     * @param method 调用的被代理的真实对象的方法的方法对象
     * @param args 代理对象方法传递的参数
     * @return
     * @throws Throwable
     */
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
