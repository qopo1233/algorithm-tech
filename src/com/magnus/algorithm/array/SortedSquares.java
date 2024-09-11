package com.magnus.algorithm.array;

import java.util.Arrays;

/**
 * @ClassName SortedSquares
 * @Description
977. 有序数组的平方
简单
给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序

请你设计时间复杂度为 O(n) 的算法解决本问题
 * @Author yangchuanhua1
 * @Date 2024/9/10 12:36
 */
public class SortedSquares {

    public static void main(String[] args) {
        SortedSquares sortedSquares = new SortedSquares();
        int[] nums = {-4,-1,0,3,10};
        int[] result = sortedSquares.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] sortedSquares(int[] nums) {
        int k = nums.length - 1;
        int[] result = new int[nums.length];
        int left = 0;
        int right = k;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[k--] = nums[left] * nums[left];
                left++;
            }else {
                result[k--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
