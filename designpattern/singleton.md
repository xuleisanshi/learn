# 单例模式

## 1，简介
### 1.1，单例模式是什么
定义：
>保证一个类仅有一个实例，并提供一个全局的访问点。

>通常我们可以让一个全局变量使得一个对象被访问，但它不能防止你实例化多个对象。一个最好的方法就是，让类本身负责保存它的唯一实例。这个类可以保证没有其他实例可以被创建，并且它可以提供一个访问该实例的方法  

### 1.2，为什么要有单例模式
系统中的一些类，例如window操作系统的任务管理器，只有一个正在工作的任务，若有多个任务管理器，第一浪费资源，第二状态内容需要保持一致，则会有额外的开销。

### 1.3，单例模式优缺点
**优点：**
> - 对于频繁使用的对象，可以省去很多创建的开销，同时也节省空间和时间。
> - 由于实例化过程次数减少，对系统的内存使用频率也降低了，同时也减少了GC的压力，缩短GC的时间。

**缺点：** 
> - 拓展性变差，由于单例模式中没有抽象层，因此拓展性变差
> - 不适用于变化的对象，如果同一类型的对象总在不同的用例场景下发生变化，单例就会引起数据错误，不能保持彼此的状态
> - 若长时间不同的实例化对象，容易被垃圾回收
> - 若数据库连接池共享链接对象过多，则容易出现连接池溢出
> - 单例指责过重，违背了单一职责原则。

### 1.4，单例模式vs全局变量

## 2，实现
### 2.1，饿汉方式
```
public class SingletonHungry {
    public static SingletonHungry uniqueInstance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getUniqueInstance() {
        return uniqueInstance;
    }
}
```
**优点：**
> 类的加载时候对类进行实例化，实例化之后一直存在，避免了多线程同步的问题。

**缺点：**
> 若类没有被使用到，类加载时就被实例化，内存就被一直占用，浪费了内存。

### 2.2，懒汉方式
懒汉方式有三种实现方式，主要是从线程安全的角度出发
#### 2.2.1，懒汉模式
```
public class SingletonLazy {
  private static SingletonLazy instance = null;

  private SingletonLazy() {

  }

  public static SingletonLazy getInstance() {//线程不安全
    if (instance == null) {
      instance = new SingletonLazy();
    }
    return instance;
  }
}
```
**优点：**
> 相对于饿汉方式，懒汉模式提高类内存的使用率，只有当类需要的时候，才会进行实例化，实例化之后就一直存在

**缺点：**
> 多线程的情况下，若多个线程同时去调用```getInstanceO()```方法，则会造成线程的不安全

#### 2.2.2， 线程安全的懒汉模式
```
public class SingletonLazy {
  private static SingletonLazy instance = null;

  private SingletonLazy() {

  }

  public static synchronized SingletonLazy getInstance() {//线程安全
    if (instance == null) {
      instance = new SingletonLazy();
    }
    return instance;
  }
}
```
**优点：**
> 通过使用```synchronized```修饰符保证了线程的安全

**缺点：**
> ```synchronized```是一个偏重量级的的锁，每个线程进来调用```getInstance()```访问实例时，都会先进行锁，增加了获取的实例的时间，也可能造成线程的阻塞。  
> ```synchronized```修饰的同步方法比一般方法要慢很多，如果多次调用getInstance()，累积的性能损耗就比较大了。

#### 2.2.3，双重检查加锁懒汉模式
利用双重检查加锁（double-checked locking），首先检查是否实例已经创建，如果尚未创建，“才”进行同步。
```
public class SingletonLazy {
  private static SingletonLazy instance = null;

  private SingletonLazy() {

  }

  public static SingletonLazy getInstance() {
    if (instance == null) {
      synchronized (SingletonLazy.class) {
        instance = new SingletonLazy();
      }
    }
    return instance;
  }
}


```
上述代码在调用```getInstance()```的时候，首先去判断是否已经被实例化，若没有，才进行实例化。保证了实例化了一次，之后都不会有锁的存在。

但是上述代码有个问题：
> **Java**中的指令重排优化，即指令重排优化是指在不改变原语义的情况下，通过调整指令的执行顺序让程序执行的更快。
> JVM可以自由的进行指令重排序的优化
> 这就造成了初始化Singleton和将对象地址赋给instance字段的顺序是不确定的。在某个线程创建单例对象时，构造方法调用之前，该对象已经分配了内存空间，并将对象的字段设置为默认值。
> 此时由于分配的内存地址赋值给了instance字段，然而该对象可能还没有初始化，若紧接着另一个线程调用```getInstance()```，取到的就是状态不对的对象，程序出错。

**进化：**

```
public class SingletonLazy {
  private volatile static SingletonLazy instance = null;//双重校验锁，是禁止指令重排序优化

  private SingletonLazy() {

  }

  public static SingletonLazy getInstance() {
    if (instance == null) {
      synchronized (SingletonLazy.class) {
        instance = new SingletonLazy();
      }
    }
    return instance;
  }
}
```
```volatile```禁止指令重排。从java 1.5版本之后开始可以使用。

**优点：**
> 相对于```synchronized```节省了很多时间。

## 2.3, 枚举方式
effective java 推荐使用，使用较少, SingletonEnum.INSTANCE.method()
```
public class SingletonResource {
}

public enum SingletonEnum {
  INSTANCE;
  private SingletonResource instance;

  private void doSomething() {
    instance = new SingletonResource();
  }

  public SingletonResource getInstance() {
    return instance;
  }
}
```
**分析：**
> 类SingletonResource是要应用的单例模式，如数据库连接池，线程池，网络连接  
> 获取资源的方式简单，```SingletonEnum.INSTANCE.getInstance()```即可获取想要的实例
> 如何实现单例：
> - 枚举中明确了构造方法限制为私有，在访问枚举实例时，会执行构造方法
> - 每个枚举实例都是```static, final```修饰符修饰，表示在类加载的时候进行实例化一次， 调用此构造方法时，单例被实例化。

**优点：**
> 保证了线程安全
> 单元素的枚举类型已经成为实现Singleton的最佳方法。

## 2.4，静态内部类[推荐]
```
public class SingletonStaticClass {

  public static class SingletonHelper {
    public static SingletonStaticClass instance = new SingletonStaticClass();
  }

  private SingletonStaticClass() {
  }

  public static SingletonStaticClass getInstance() {
    return SingletonHelper.instance;
  }
}

```
**分析：**
> 同样使用了类加载机制，在类第一次加载的时候，对类进行了实例化，因此不存在线程安全的问题。
> 只要应用不使用内部类，JVM就不会去加载这个单例类，也就不会去创建单例对象，即实现了懒汉的延迟加载。

**优点：**
> 同时实现了**延迟加载**和**线程安全**

## 3，应用
单例模式应用的场景一般发现在以下条件下：
> - 资源共享的情况下，避免由于资源操作时导致的性能耗损等，如日志，应用配置等。
> - 控制资源的情况下，方便资源之间的互相通信，如线程池。
### 3.1，常见应用场景
- 操作系统的文件系统
- 
- Window的任务管理器
- 
- 网站计数器
- 
- 应用程序的日志
- 
- 数据库连接池
- 
- 多线程的线程池

### 3.2，Springboot中的单例模式

Spring bean的单例是指在spring bean容器（Application Context）中仅有一个实例。

spring singleton的缺省是饿汉模式:启动容器时(即实例化容器时),为所有spring配置文件中定义的bean都生成一个实例
