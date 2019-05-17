# Leet Code

## Array
TODO
### Item 75 Sort Colors
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

```
Example:
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```
Follow up:
A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
Could you come up with a one-pass algorithm using only constant space?

[样例代码][Item75]  
**分析：**    
本题目关键是控制好对应index的移动顺序，题目难度不大

**坑：**   


### Item 88. Merge Sorted Array
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:
```
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
Output: [1,2,2,3,5,6]
```
[样例代码][Item88]  
**分析：**    
本题目关键是控制好对应index的移动顺序，题目难度不大，从最大的开始对比，较大的数放在最后的位置，依次比下去，直到所有的都放好。

**坑：**   
index！！！对应位置！！！！

### Item 215
### Item 167 
### Item 26. Remove Duplicates from Sorted Array
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

**Example 1:**
```
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
```
**Example 2:**
```
Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length. 
``` 

**Clarification:**

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:
```
// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);
// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
```
[样例代码][Item26]  
**分析：**   本题题目要求不能复制一个辅助的数组，同时要进行最小的操作数。因此，在此本程序中，主要操作在原数组上进行，空间复杂度是O(1)，进行n次的循环，因此，时间复杂度是O(n).同时需要考虑当数组为空的情况。  

**牛逼的答案**
```
int count = 0;
for (int i=1;i<nums.length;i++){
    if (nums[i]==nums[i-1])
        count++;
    else nums[i-count]=nums[i];
}
return nums.length-count;
```
**坑：**



### Item 286. Move zeros

Given an array `nums`, write a function to move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Example:**

```
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
```

**Note**:

1. You must do this **in-place** without making a copy of the array.
2. Minimize the total number of operations.

[样例代码][Item286]

**分析：**
本题题目要求不能复制一个辅助的数组，同时要进行最小的操作数。因此，在此本程序中，主要操作在原数组上进行，空间复杂度是O(1)，进行n次的循环，因此，时间复杂度是O(n).  
难度为：✨  
**坑：**  
考虑初始位置，刚开始时候就让i从1开始循环，明显就是错误的。












[Item26]: ./src/main/java/com/lei/learn/leetcode/Array/Item26.java "Remove Duplicates from Sorted Array"
[Item75]: ./src/main/java/com/lei/learn/leetcode/Array/Item75.java "Sort Colors"
[Item88]: ./src/main/java/com/lei/learn/leetcode/Array/Item88.java "Merge Sorted Array"
[Item286]: ./src/main/java/com/lei/learn/leetcode/Array/Item286.java	"Move Zeros"