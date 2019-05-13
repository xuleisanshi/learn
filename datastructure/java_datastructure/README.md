# 1. Data Structure(java version)  
Refer to [This Vedio][StudyVideo]  

-------  
## 1.1. 算法复杂度分析  
### 1.1.1. 时间复杂度分析  
### 1.1.2. 空间复杂度分析  

-------  

## 1.2. 线性存储结构 
线性存储结构主要有两种存储形式，1，顺序存储结构；2，链式存储结构。
| 线性存储结构 | 顺序存储结构 | 链式存储结构 |
| ------ | ------ | ------ |
| 特点 | 1，可以随机访问<br /> 2，占用连续的空间，存储分配必须提前进行，即静态分配。一旦分配好了，在对其操作的过程中不变<br />3，插入操作需要移动多个元素  | 1，不可以随机访问<br />2，不需要连续的空间，空间动态分配，即在要创建节点的时候进行空间的划分<br />3，插入操作不需要移动多个元素<br />4，每个结点划一部分空间存储指向下一个节点位置的指针，故存储空间利用率比顺序表稍低。 |

### 1.2.1. 数组  
 **特点：** 寻址读取数据比较容易，插入和删除比较困难。

[样例代码][ArrayCode]  

常见操作：
- 插入： 后边的后移
- 遍历
- 获取数组大小
- 根据位置，获取当前存储的值
- 查找
  - 线性查找
  - 二分法查找
- 删除: 后边的后移

### 1.2.2. 查找算法  
- 顺序查找  
**基本思想：**   
顺序查找也称为线形查找，属于无序查找算法。从数据结构线形表的一端开始，顺序扫描，依次将扫描到的结点关键字与给定值k相比较，若相等则表示查找成功；若扫描结束仍没有找到关键字等于k的结点，表示查找失败。  
**复杂度分析：**   
查找成功时的平均查找长度为：（假设每个数据元素的概率相等） ASL = 1/n(1+2+3+…+n) = (n+1)/2 ; 当查找不成功时，需要n+1次比较，时间复杂度为O(n); 所以，顺序查找的时间复杂度为O(n)。
```JAVA
  public int linearSearch(E targetElement) {
    int index = -1;
    for (int i = 0; i < elements.length; i++) {
      if (elements[i] == targetElement) {
        index = i;
        break;
      }
    }
    return index;
  }
```
- 二分法查找
**基本思想：**  
也称为是折半查找，属于有序查找算法。用给定值k先与中间结点的关键字比较，中间结点把线形表分成两个子表，若相等则查找成功；若不相等，再根据k与该中间结点关键字的比较结果确定下一步查找哪个子表，这样递归进行，直到查找到或查找结束发现表中没有这样的结点。
**复杂度分析：**  
最坏情况下，关键词比较次数为log(n+1)，且期望时间复杂度为O(logn)；  
代码一：
```JAVA
public int binarySearch(int elements[], int targetElement) {
  int index = -1;
  int beginIndex = 0;
  int endIndex = elements.length;
  //TODO element should be sorted ascending
  int midIndex = (beginIndex + endIndex) / 2;
  // the condition to end the loop
  while (beginIndex < endIndex) {
    if (elements[midIndex] == targetElement) {
      index = midIndex;
      break;
    } else if (elements[midIndex]>targetElement) {
      endIndex = midIndex - 1;
      midIndex = (endIndex + beginIndex) / 2;
    } else {
      beginIndex = midIndex + 1;
      midIndex = (beginIndex + endIndex) / 2;
    }
  }
  return index;
}
```
代码二：递归思想
```JAVA
public int binarySearch(int array[], int targetValue, int low, int high) {
  int mid = low + (high - low) / 2;
  if (array[mid] == targetValue) {
    return mid;
  } else if (array[mid] > targetValue) {
    return binarySearch(array, targetValue, low, mid - 1);
  } else {
    return binarySearch(array, targetValue, mid + 1, high);
  }
}
```


### 1.2.3. 栈  
### 1.2.4. 队列  
### 1.2.5. 单链表  
### 1.2.6. 循环链表  
### 1.2.7. 双向循环链表  
### 1.2.8. 递归  
--------  

## 1.3. 排序算法  
### 1.3.1. 冒泡排序  
### 1.3.2. 快速排序  
### 1.3.3. 插入排序  
### 1.3.4. 希尔排序  
### 1.3.5. 选择排序  
### 1.3.6. 归并排序  
### 1.3.7. 基数排序  
--------  

## 1.4. 树  
### 1.4.1. 二叉树  
### 1.4.2. 顺序存储二叉树  
### 1.4.3. 线索二叉树  
### 1.4.4. Hoffman树  
### 1.4.5. 二叉排序树  
### 1.4.6. 平衡二叉树  
### 1.4.7. 其他树  
--------  

## 1.5. 哈希表  
​		Hash一般翻译做“散列”也有直接音译为“哈希”的就是把任意长度的输入通过散列算法变换成固定长度的输出该输出就是散列值。  
​		散列表,它是基于快速存取的角度设计的也是一种典型的“**==空间换时间==**”的做法。顾名思义该数据结构可以理解为一个线性表但是其中的元素不是紧密排列的而是可能存在空隙。  
​   散列表（Hash table也叫哈希表）是根据关键码值(Key value)而直接进行访问的数据结构。也就是说它通过把关键码值映射到表中一个位置来访问记录以加快查找的速度。这个映射函数叫做散列函数存放记录的数组叫做散列表。  
### 1.5.1. 散列函数设计  
散列函数的设计原则  
- 计算简单  
- 分布均匀  
### 1.5.2. 散列函数主要方法  
- 直接定址法：[样例代码][HashCode]  
- 平方取中法  

- 数据分析法（例如手机号码）对数据比较了解推荐使用  

- 取余法  

- 随机数法存储地址=random();  

### 1.5.3. 散列冲突  
- 开放地址法  
  - 线性探测法  
  - 二次探测法  
  - 再哈希法（多个散列函数一般三个可以解决大部分问题
- 链地址法  
--------  

## 1.6. 图  
### 1.6.1. 图的概念  
- 顶点vertex  
- 边 edge  
- 邻接  
- 路径  
- 有向图和无向图  
- 带权图  
### 1.6.2. 图的遍历  
#### 1.6.2.1. 深度优先搜索算法  
- 栈  
#### 1.6.2.2. 广度优先搜索算法  
- 堆  
#### 1.6.2.3. 代码实现  




[StudyVideo]: https://www.bilibili.com/video/av33835237/ "数据结构与算法基础-java版"  
[ArrayCode]:./src/main/java/com/lei/learn/datastructure/linearStructue/ArrayObject.java "Array"
[HashCode]: ./src/main/java/com/lei/learn/datastructure/hash/HashTable.java "hash table"  
