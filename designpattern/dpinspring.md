# Spring中的设计模式

Spring中涉及了以下几种设计模式
- [单例模式][Singleton]
- [工厂模式][Factory]
- [代理模式][Proxy]
- [模板模式][Template]
- [观察者模式][Observer]
- [适配器模式][Adapter]

## 1，单例模式在Spring中的应用场景

## 2，工厂模式在Spring中的应用场景

## 3，代理模式在Spring中的应用场景

AOP是基于代理模式实现的
> - 默认的，若目标对象是接口，则使用JDK动态代理模式
> - 若目标对象不是接口，则使用CGLIB动态代理模式

## 4, 模板模式在Spring中的应用场景
ORM是基于模板模式实现的
> jdbcTemplate等



## 5，观察者模式

## 6，适配器模式
待加工

> When doing Enterprise Application Development with the Spring Framework, you will be using adapters built into the framework. Spring Integration uses JMS adapters to send and receive JMS messages and JDBC adapters to convert messages to database queries and result sets back to messages.
> Spring also uses the adapter design pattern to handle load-time-weaving used in Aspect-Oriented Programming (AOP). An adapter is used to inject AspectJ’s aspects to bytecode during class loading done by the servlet container.
[Reference](https://springframework.guru/gang-of-four-design-patterns/adapter-pattern/)

[Singleton]: ./singleton.md "singleton"
[Factory]: ./factory.md "factory"
[Proxy]: ./proxy.md "proxy"
[Template]: ./template.md "template"
[Observer]: ./observer.md "observer"
[Adapter]: ./adapter.md "adapter"