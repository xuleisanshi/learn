package com.lei.learn.javabasic.designPattern.Structural.Proxy.CGlib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Tencent implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    /**
     * 通过入参即父类的字节码，通过扩展父类的class来创建代理对象
     * @param clazz 真实主题类，也就是需要代理的类
     * @return
     */
    public Object getProxy(Class clazz) {
        //设置要创建的子类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * @param object      代理对象的实例
     * @param method      拦截方法，代理对象的实例的反射对象
     * @param arg         拦截方法的参数
     * @param methodProxy 代理类实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object object, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable {
        login();
        Object obj = methodProxy.invokeSuper(object, arg); // 通过代理类调用父类的中方法
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
