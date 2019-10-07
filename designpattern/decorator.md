# 装饰模式

## 1，简介
一种替换继承关系的方案，无需通过继承就可以增加子类就能扩展对象的新功能。使用对象的关联关系代替继承关系，更为灵活，并避免类型体系的快速膨胀。

### 1.1，什么是装饰模式
**定义：**
> 动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。

### 1.2，为什么要装饰模式
动态的为对象添加新的功能
> 归根到底要结局的问题就是继承的滥用。当频繁的继承使我们的代码变成一条线的时候，就应该考虑一下如何在运行的时候来对类的属性进行扩展。而不是前期直接构思好继承逻辑，这会使得代码冗余度过高。违背**开闭原则**。

## 2，实现
装饰模式主要有四种**角色：**
角色|关系|作用|
:-:|:-:|:-:|
抽象构件（Component）|公共父类|装饰类和具体构建的公共父类，可以给这些对象动态地添加职责
具体构件（ConcreteComponent）|抽象构件的子类|定义一个具体的类，也可以给这个对象添加一些职责
装饰抽象类（Decorator）|装饰子类的父类，抽象构件的子类|给具体点的构件添加一些新的职责
具体装饰类（ConcreteDecorator）|抽象装饰类的实现类|负责向构件具体的添加职责
**见下图：**
![decorator][decorator]
本文案例中继续使用煮面的例子，我在煮面的过程中，需要不同的面条，宽面，细面，也需要不同的浇头，浇头就类似于不同面条的一个装饰。

**抽象构件类：**
```
public abstract class Noodles {

  String description = "null";

  public abstract String concreteNoodles();
}
```

**具体构件类：**
```
//具体构件类，宽面
public class KuanMian extends Noodles {

  public KuanMian() {
    description = "Kuan mian";
  }

  @Override
  public String concreteNoodles() {
    return description;
  }
}

//具体构件类 细面
public class XiMian extends Noodles {

  public XiMian() {
    description = "Xi Mian";
  }

  @Override
  public String concreteNoodles() {
    return description;
  }
}
```

**抽象装饰类：**
```
public abstract class JiaoTou extends Noodles {

  public abstract String getJiaoTou();
}
```

**具体装饰类：**
```
//具体装饰类 牛肉浇头
public class Beef extends JiaoTou {
  Noodles noodles;

  public Beef(Noodles noodles) {
    this.noodles = noodles;
  }

  @Override
  public String getJiaoTou() {
    return "Beef";
  }

  @Override
  public String concreteNoodles() {
    return noodles.concreteNoodles() + " " + getJiaoTou();
  }
}

//具体装饰类 猪肉浇头
public class Pork extends JiaoTou {
  Noodles noodles;

  public Pork(Noodles noodles) {
    this.noodles = noodles;
  }

  @Override
  public String getJiaoTou() {
    return "Pork";
  }

  @Override
  public String concreteNoodles() {
    return noodles.concreteNoodles() + " " + getJiaoTou();
  }
}
```

**测试：**
```
public class DecoratorDemo {

    public static void main(String[] args) {

        Noodles noodles = new KuanMian();
        System.out.println(noodles.concreteNoodles());
        noodles = new Beef(noodles);

        System.out.println(noodles.concreteNoodles());
        noodles = new Pork(noodles);
        System.out.println(noodles.concreteNoodles());

        Noodles noodles1 = new XiMian();
        System.out.println(noodles1.concreteNoodles());
        noodles1 = new Beef(noodles1);

        System.out.println(noodles1.concreteNoodles());
        noodles1 = new Pork(noodles1);
        System.out.println(noodles1.concreteNoodles());
    }
}
```

**输出：**
```
Kuan mian
Kuan mian Beef
Kuan mian Beef Pork
Xi Mian
Xi Mian Beef
Xi Mian Beef Pork
```

## 3，优缺点

**优点：**
> - 把类中的装饰功能从类中搬移去除，这样可以简化原有的类。
> - 有效地把类的核心职责和装饰功能区分开来，而且可以去除相关类中重复的装饰逻辑

**缺点：**
> 多层装饰比较复杂。比如我们现在有很多层装饰，出了问题，需要层层检查

## 4，应用场景

> java.io包内的类很多都是装饰者




[decorator]:./asserts/decorator.png