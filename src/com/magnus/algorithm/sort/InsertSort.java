package com.magnus.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @Description 插入排序
 * @Author yangchuanhua1
 * @Date 2024/8/13 08:22
 */
public class InsertSort {


    public static void main(String[] args) {
        int[] nums = {5,8,7,2,9,4,3,6,1};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertSort(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > value) {
                    nums[j+1] = nums[j];
                }else {
                    break;
                }
            }
            nums[j+1] = value;
        }
    }
}
