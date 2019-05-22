package com.lei.learn.leetcode.Array;

public class Item11 {


    public static int maxArea(int[] height) {
        int max = 0;

        if (height.length < 2) return max;

        for (int i = 0; i < height.length; i++)
            for (int j = height.length - 1; j > i; j--) {
                int low = 0, tmp = 0;
                if (height[i] < height[j])
                    tmp = height[i] * (j - i);
                else tmp = height[j] * (j - i);
                if (max < tmp)
                    max = tmp;
            }

        return max;


    }

    public static int maxArea1(int[] height) {
        int max = 0;

        int low = 0, high = height.length - 1;
        while (low < high) {
            int small = height[low] < height[high] ? height[low] : height[high];
            max = max > (small * (high - low)) ? max : (small * (high - low));
            if (height[low] < height[high])
                low++;
            else high--;
        }


        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = new int[]{1};

        System.out.println(maxArea(height));
        System.out.println(maxArea1(height));
    }

}
