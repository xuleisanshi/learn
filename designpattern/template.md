# 模版模式

## 1，简介

### 1.1，什么是模板模式

模版模式由一个抽象类组成，这个抽象类定义了需要覆盖的可能由不同实现的模版方法，每个从这个抽象类派生出来的具体类将为此模版实现新方法。

### 1.1，什么是模版模式

**定义：**
> 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构既可以重定义该算法的某些特定的步骤。
定义读起来有些拗口，在一个blog上看到一个很口语化的解释：
> 完成一件事情，有固定的数个步骤，但是每个步骤根据对象的不同，而实现细节不同；例如数据库连接的模版，需要数据库连接的获取，执行SQl，数据库连接的关闭等固定的步骤。但是不同的数据库之间执行各个步骤是有区别的，例如mysql和oracle细节不同。
> 为了解决上述问题，就可以在父类中定一个完成该事情的总的方法，按照完成该事情需要的步骤去调用每个步骤的实现方法，每个步骤的具体实现在子类中完成。

### 1.2，为什么要有模板模式
> 代码重复是编程中最常见，最糟糕的“Bad Smell”（坏味道），如果我们在一个以上的地方看到相同的程序结构，那么可以肯定，设法将它们合而为一，程序会变得更好。但是完全相同的代码当然存在明显的重复，而微妙的重复会出现在表面不同但是本质相同的结构或处理步骤中。

## 2，模版模式的实现

我比较喜欢吃各种面食，本文使用煮面的例子进行实现。
大家都知道，在煮面的过程中，基本上都是准备浇头，烧水，煮面，盛面等过程。
浇头的类型是不一样的，比如西红柿鸡蛋面，或者榨菜肉丝面等。当然面的类型也是不一样的，可以是宽面，或者细面。

最后，使用钩子方法来处理是汤面还是拌面。

**模式模版中的角色：**

**抽象父类(AbstractClass)：**
定义模版方法，即定义一些公共的行为，将可变的行为抽象，让子类进行具体的实现。

```
public abstract class CookingNoodles {
    boolean isBanNoodles = false;

    void prepareJiaoTou(String jiaotou) {
        System.out.println("浇头： " + jiaotou);
    }

    void cookingNoodles(String noodles) {
        System.out.println("面条： " + noodles);

    }

    //定义为保户类型，对外不可见这个方法
    protected void hook() {
        //空实现，给子类留有可扩展的余地
    }

    boolean isHook() {
        return false;
    }

    CookingNoodles cooking(String jiaoTou, String noodles) {

        prepareJiaoTou(jiaoTou);
        cookingNoodles(noodles);
        if (isHook()) {
            hook();
        }
        return this;
    }
}
```

**具体子类(ConcreteClass)：**
实现抽象父类的内容，具体实现可以变的内容。

```
public class XiHongShiEggNoodles extends CookingNoodles {
    @Override
    boolean isHook() {
        return true;
    }

    @Override
    public void hook() {
        System.out.println("钩子： 汤面");
    }

    @Override
    CookingNoodles cooking(String jiaotou, String noodles) {
        return super.cooking(jiaotou, noodles);
    }
}

```

**一个很重要的概念——钩子方法：**
> 在抽象类中定义一个方法，默认不做任何事情，子类根据实际的情况，来决定要不要覆盖它，从而改变一些行为。该方法称为钩子(hook).

```
    @Override
    boolean isHook() {
        return true;
    }

    @Override
    public void hook() {
        System.out.println("钩子： 汤面");
    }
```

**测试：**
```
public class TemplateDemo {
    public static void main(String[] args) {
        XiHongShiEggNoodles cookingNoodles = new XiHongShiEggNoodles();
        cookingNoodles.cooking("西红柿鸡蛋", "宽面");
    }
}
```
**输出：**
```
浇头： 西红柿鸡蛋
面条： 宽面
钩子： 汤面
```
## 3，优缺点

**优点：**
> - 在抽象类中封装了不变的部分，在具体实现中拓展可变的内容
> - 提供公共代码，易于维护
> - 行为由父类控制，子类实现，符合**开闭原则**
> - 代码复用度高，减少代码冗余

**缺点：**
> - 每个不同的实现都要增加子类，会导致类的数目变多，增加类系统的复杂度
> - 由于继承的关系，父类的增加或者修改抽象方法，子类都需要去修改

## 4，应用场景
> - 多个类共有的方法，逻辑相同
> - 一次性实现了一个算法的不变内容，并将可变的行为留给子类实现
