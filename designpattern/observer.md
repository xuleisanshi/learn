# 观察者模式

## 1，简介
观察者模式也叫做发布订阅模式，也是设计模式中最容易理解的一种模式，
>例如我们经常用的微信公众号，当我们订阅了某个公众号之后，就注册到了该公众号的订阅列表里，当公众号有新的文章发布，所有订阅过的用户都可以收到该文章。
### 1.1，观察者模式是什么？
**定义：**
> 定义一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化的时候，会通知所有观察者对象，使它们能够自动更新自己。

### 1.2，为什么要有观察者模式

> 在软件设计中，有很多时候对象a需要知道对象b的状态变化，

## 2，实现
观察者模式一共有四种角色：
角色|关系|作用|
:-:|:-:|:-:|
抽象主题角色（Subject）|具体主题角色的接口| 提供接口，增加、删除和更新信息到观察者
具体主题角色（Concrete Subject）|实现抽象主题角色| 实现增加、删除和更新信息到观察者接口
抽象观察者角色（Observer）|具体观察者角色的接口类| 为所有的观察者定义一个接口，当接到主题的更新后，更新自己的接口
具体观察者角色（Concrete Observer）|实现抽象观察者角色|实现当主题更新后，更新自己的接口内容

**例子：**
> 如煮面的例子，厨房做好面，相关的食客进来吃面，当厨房做好面，食客收到通知，就可以吃面了。

**抽象主题角色：**
```
public interface Kitchen {

    void attach(Diners diners);

    void detach(Diners diners);

    void update();
}
```

**具体主题角色：**
```
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
```

**抽象观察者角色：**
```
public interface Diners {
    void eat();
}
```
**具体观察者角色：**
```
public class DinerA implements Diners {
    private String name;

    public DinerA(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + ": 吃面咯");

    }
}
```

**测试：**
```
public class ObserverDemo {

    public static void main(String[] args) {

        CookingNoodles cookingNoodles = new CookingNoodles();
        DinerA zhangsan = new DinerA("zhangsan");
        DinerA lisi = new DinerA("lisi");
        cookingNoodles.attach(zhangsan);
        cookingNoodles.attach(lisi);
        cookingNoodles.update();
    }
}

```

**输出**
```
zhangsan: 吃面咯

lisi: 吃面咯
```

## 3，优缺点

**优点：**
> - 观察者模式可以实现表现层和数据逻辑层的分离，并定义了稳定的消息更新传递机制，抽象了更新接口，使得可以有各种各样的不同的表示层作为具体观察者角色存在。
> - 实现了目标和观察者的松耦合
> - 支持广播通信
> - 符合**开闭原则**

**缺点：**
> - 若观察者过多，则通知的开销会很大
> - 若观察者和主题角色之间有循环以来的话，会导致系统崩溃
> - 观察者模式没有相应的机制让观察者知道如何发生了变化，而只是知道了发生了变化。

## 4，适用场景
> - 对一个对象状态的更新，需要其他对象同步更新，而且其他对象的数量动态可变。
> - 对象仅需要将自己的更新通知给其他对象而不需要知道其他对象的细节。


**Spring中的的观察者模式**
> -   spring事件：ApplicationEvent事件，该抽象类继承了EventObject，jdk建议所有的事件都应该继承自EventObject
> -   spring事件发布：ApplicationEventPublisher , ApplicationContext继承了该接口，在ApplicationContext的抽象类AbstractApplicationContext中做了实现


