# 策略模式

## 1，简介

策略模式(Strategy pattern)也叫做政策模式(Policy pattern)，指的是对象具备某个行为，但是在不同的场景中，实现该行为具有不同的算法。
> 为了完成一个任务，往往有多种不同的方式，每一种方式成为一个策略，我们可以根据环境或者条件的不同选择不同的策略来完成该任务。

### 1.1，什么是策略模式
**定义：**
> 定义一组算法，将每个算法都封装起来，并且使他们之间可以互相互换。
策略模式使用的就是面对对象的继承和多态机制，从而实现同一行为在不同场景下具备不同实现。
策略模式的本质是：分离算法和选择实现。

### 1.2，为什么要有策略模式

在系统实现中，常常为了实现某一种功能，常常就是在一个类中使用if-else等条件判断来进行选择，从而使用不同的算法来达到不同的效果，其实这是一种硬编码。如果需要增加一种新的方法，则要修改封装算法类的源代码，违背了**开闭原则**，也使得代码变得负责，维护较为困难。


## 2，实现
策略模式中包含三个角色：
角色 | 关系 | 作用 
:-: | :-: | :-: 
抽象策略角色（Abstract Strategy）| 是具体策略角色的父类|是一个抽象的角色，通常是一个接口或抽象类实现
具体策略角色（Concrete Strategy）| 是抽象策略角色的子类|具体的算法或者行为，实现了策略接口或者继承了抽象类
环境角色（Context）|运行时持有策略类的引用| 给客户端进行调用

**例子：**
> 本文使用的例子同样是煮面的例子，在煮面的过程中，都需要做浇头，浇头具有不同的类型，如西红柿鸡蛋，鱼香肉丝等。因此，可以将浇头策略进行抽象。

**抽象策略角色：**
```
public interface JiaoTou {
    public void cookingJiaoTou();
}
```
**具体策略角色：**
```
public class XihongshiEgg implements JiaoTou {
    @Override
    public void cookingJiaoTou() {
        System.out.println("制作浇头：西红柿鸡蛋");
    }
}

public class Yuxiangrousi implements JiaoTou {
    @Override
    public void cookingJiaoTou() {
        System.out.println("制作浇头：鱼香肉丝");
    }
}
```
**环境角色：**
```
public class KitchenContext {
    private JiaoTou jiaoTou;

    public KitchenContext(JiaoTou jiaoTou) {
        this.jiaoTou = jiaoTou;
    }


    public void cookingJiaoTou() {
        jiaoTou.cookingJiaoTou();
    }

}
```
**测试：**
```
public class StrategyDemo {

    public static void main(String[] args) {

        XihongshiEgg xihongshiEgg = new XihongshiEgg();
        KitchenContext eggContext = new KitchenContext(xihongshiEgg);

        Yuxiangrousi yuxiangrousi = new Yuxiangrousi();
        KitchenContext rousiContext = new KitchenContext(yuxiangrousi);
        eggContext.cookingJiaoTou();
        rousiContext.cookingJiaoTou();
    }
}
```
**输出：**
```
制作浇头：西红柿鸡蛋
制作浇头：鱼香肉丝
```

## 3，策略模式的优缺点
**优点：**
> - 完美支持了**开闭原则**，用户可以不需要修改原来的系统基础上，灵活的新增新的算法或者行为。
> - 提供了管理相关算法族的方法
> - 提供了可以替代继承关系的方法
> - 避免使用了多重条件的转移语句

**缺点：**
> - 客户端必须知道所有的具体策略类，然后自行决定使用哪一种策略类。
> - 策略模式会产生很多的策略类，造成了大量的策略存在。享元模式在一定程度上可以减少对象的数量。

## 4，应用
> - 算法需要自由切换的场景
> - 需要屏蔽算法规则的场景
> - 针对同一个类型的问题，处理方法比较多，每一种都能独立解决问题。

**Spring中的策略模式：**
>org.springframework.beans.factory.support.InstantiationStrategy负责根据BeanDefinition对象创建一个Bean实例。

## 引用
https://design-patterns.readthedocs.io/zh_CN/latest/behavioral_patterns/strategy.html