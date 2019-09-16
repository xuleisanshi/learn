# 工厂模式

## 1，简介
### 1.1，工厂模式是什么
**定义：**
> 在基类中定义创建对象的一个接口，让子类决定实例化哪个类。
工厂方法让一个类的实例化延迟到子类中进行。

### 1.2，为什么要有工厂模式

> - 解耦，将对象的创建和使用过程分开，即当class A想调用class B，其实A只是使用B的方法，B的实例化过程，则可以交给工厂类来完成。
> - 降低重复代码，如果创建对象B的过程比较复杂的化，就需要一定的代码量，而且可能很多地方都会用到，就会产生很多重复的代码。若放入工厂类中统一管理，则减少了重复代码，而且方便对B的创建过程的维护。
> -  维护成本降低，创建过程都由工厂统一管理，当业务逻辑发生变化后，不需要找到所有的实例化B的地方去修改，只需要在工厂中修改即可，从而降低维护成本。

### 1.3，适用场景
> - 对象的创建过程/实例化准备工作很复杂，需要初始化很多参数。例如数据库连接
> - 类本身有很多子类，创建过程中业务很容易发生改变，或者类的调用容易发生法改变。

## 2，工厂模式分类及实现

### 2.1，简单工厂模式
**简单工厂模式**
此模式不在23中常用的设计模式中，只能算是工厂模式的一个特殊实现。此模式在实际中的应用很少，只适应很简单的情况。
> 简单工厂模式还违背了**开闭原则**，每次添加新的功能，都要在switch-case或者if—else语句中增加分支，修改代码。

#### 2.1.1，简单工厂模式的三种角色
> - 抽象产品角色(Product)：简单工厂模式所创建的所有对象的弗雷，负责描述所有类共有的接口。
> - 具体产品角色(Concrete Product)：简单工厂模式所创建的目标对象，都是对应角色类的实例。
> - 工厂角色(Factory)：负责创建所有具体产品角色类的实例，是简单工厂模式的核心，可以被外界直接调用，从而实例化产品的对象。

### 2.1.2，简单工厂对象实现
创建一个可以生产手机的工厂，可以生产apple，huawei等，每个手机都有一个可以查询手机类型的方法。

**抽象产品角色：**
```
public interface Phone {//抽象接口类，abstract phone类
    public void getPhoneName();
}
```

**具体产品角色：**
华为手机：
```
public class HuaWei implements Phone {
    @Override
    public void getPhoneName() {
        System.out.println("HuaWei produced!");
    }
}
```
Apple手机:
```
public class Apple implements Phone {//具体产品类concrete product
    @Override
    public void getPhoneName() {
        System.out.println("iPhone produced!");
    }
}
```

**工厂角色：**
```
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
}
```

**测试方法：**
```
public class FactoryDemo {

    public static void main(String[] args) {
        Phone apple = PhoneFactory.makePhone("Apple");
        Phone huaWei = PhoneFactory.makePhone("HuaWei");
        apple.getPhoneName();
        huaWei.getPhoneName();
    }
}
```

**输出：**
```
iPhone produced!
HuaWei produced!
```

**反射机制满足开闭原则：**
```
public class PhoneFactory {//工厂类
  public static Object makePhone(Class<? extends Phone> clazz) {
      Object object = null;
      try {
          object = Class.forName(clazz.getName()).newInstance();
      } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
          e.printStackTrace();
      }
      return object;
  }
}

```
**测试类：**
```
public class FactoryDemo {
  public static void main(String[] args) {
    Apple apple1 = (Apple) PhoneFactory.makePhone(Apple.class);
    HuaWei huaWei1 = (HuaWei) PhoneFactory.makePhone(HuaWei.class);
    apple1.getPhoneName();
    huaWei1.getPhoneName();
  }
}
```

**输出：**
```
iPhone produced!
HuaWei produced!
```

### 2.1.3，简单工厂适用场景
> - 适用于创建的对象较少的情况
> - 客户端不关心工厂对象实例化的过程
### 2.1.4，简单工厂优缺点
**优点：**
> - 此类中有必要的判断条件，可以决定在什么时候创建哪一种类的实例化。
> - 客户端仅仅使用对象，而不关心创建过程，实现了对责任的分割
> - 根据外界给定的信息，工厂类决定具体实例化哪个对象

**缺点：**
> - 当产品的多层级结构比较复杂的时候，工厂类无法满足需求
> - 不利于维护，一旦增加或者删除产品，需要修改整个工厂类，扩展困难，违背了开闭原则
> - 简单工厂使用了静态工厂方法，无法由子类集成。


### 2.2，工厂方法模式


## 3，应用

## 4，总结