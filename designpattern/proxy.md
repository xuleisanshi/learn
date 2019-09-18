# 代理模式

## 1，代理模式简介
代理模式使用代理完成用户请求，屏蔽用户对真是对象的访问。在现实的世界中，存在很多的代理模式，例如房产中介，游戏代理商等，代理人被授权执行当事人的一些事情，从而不需要当事人出面。
软件设计中，在很多地方都需要用到代理模式，例如安全原因，客户端无法访问真实或者操作真实对象，也可能为了提高系统性能，对真实的对象进行封装，从而达到延迟加载的目的。

### 1.1，代理模式是什么
**定义：**
> 为其他对象提供一种代理以控制对这个对象的访问

### 1.2，为什么要代理模式

> - 客户端不能直接操作某个对象，但又必须和该对象进行互动
> - 授权机制，不同级别的用户对同一个对象拥有不同的访问权利，可以通过proxy模式来实现权限控制。

### 1.3，代理模式的角色

> - 抽象主题角色，Abstract subject，真实主题与代理主题的共同接口
> - 真实主题角色，Real subject，定义代理角色所代表的真实对象
> - 代理主题角色，Proxy，含有对真实主题角色的引用，代理角色通常在客户端调用传递给真实对象方法之前或者之后执行某些操作，而不是单纯的操作对象。

## 2，代理模式实现
代理模式主要有三种情况：**静态代理模式**，**JDK动态代理模式**，**CGLIB动态代理模式**。

### 2.1，静态代理模式
**定义：**
> 之所以叫静态代理模式，就是因为此代理模式中所代理的类是实现预定好的，静态的。

本demo中，使用的例子是我最喜欢的游戏coc，是supercell游戏公司开发的游戏，该游戏的代理公司是Tencent。因此，本例中，抽象主题角色就是Game接口，真实主题是supercell，代理主题角色就是Tencent。

**抽象主题角色：**
```
public interface Game {
    public void playGame();
}
```
**真实主题角色：**
```
public class SuperCell implements Game {
    @Override
    public void playGame() {
        System.out.println("Play super cell game, like coc");
    }
}
```
**代理主题角色：**
```
public class Tencent implements Game {
    private SuperCell superCell;


    @Override
    public void playGame() {
        if (superCell == null) {
            superCell = new SuperCell();
        }
        login();
        superCell.playGame();
        logout();
    }

    private void login() {
        System.out.println("Login Game");
    }

    private void logout() {
        System.out.println("Logout Game");
    }
}
```

**测试：**
```
public class ProxyDemo {
    public static void main(String[] args) {
        Tencent tencent = new Tencent();
        tencent.playGame();
    }
}
```

**输出：**
```
Login Game
Play super cell game, like coc
Logout Game
```
### 2.2，JDK动态代理模式
> JDK中有对动态代理的支持，通过JDK中Proxy类来实现。
> JDK动态代理模式的原理用一句话来概括就是：通过类装载器拿到真实实现类（被代理的类）和真实实现类（被代理的类）的接口的字节码文件，然后构成生成一个代理类（是具有被代理类字节码的文件）。生成完成后，就回到了静态代理的模式上进行。

**几个重点的知识点：**
**InvocationHandler**
在JDK动态模式中，代理类不再实现抽象主题接口类，而是实现```InvocationHandler```接口，该接口只有一个方法```invoke```方法。

**invoke**

**Proxy.newProxyInstance**

**抽象主题角色：**
```
public interface Game {
    public void playGame();
}
```
**真实主题角色：**
```
public class SuperCell implements Game {
    @Override
    public void playGame() {
        System.out.println("Play super cell game, like coc");
    }
}
```
**代理主题角色：**
```
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
        return object;
    }


    private void login() {
        System.out.println("Login Game");
    }

    private void logout() {
        System.out.println("Logout Game");
    }
}
```

**测试：**
```
public class ProxyDemo {
    public static void main(String[] args) {
        SuperCell superCell = new SuperCell();
        Tencent tencent = new Tencent(superCell);
        Game game = (Game) Proxy.newProxyInstance(SuperCell.class.getClassLoader(), SuperCell.class.getInterfaces(), tencent);
        game.playGame();
    }
}

```

**输出：**
```
Login Game
Play super cell game, like coc
Logout Game
```

## 3，代理模式应用