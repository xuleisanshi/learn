# Leet Code

## Array

### Item 286

Given an array `nums`, write a function to move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Example:**

```
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
```

**Note**:

1. You must do this **in-place** without making a copy of the array.
2. Minimize the total number of operations.

[Item286][Item286]

**分析：**
本题题目要求不能复制一个辅助的数组，同时要进行最小的操作数。因此，在此本程序中，主要操作在原数组上进行，空间复杂度是O(1)，进行n次的循环，因此，时间复杂度是O(n).  
难度为：✨













[Item286]: ./src/main/java/com/lei/learn/leetcode/Array/Item286.java	"Move Zeros"