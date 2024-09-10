package com.magnus.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName SelectSort
 * @Description 选择排序
 * @Author yangchuanhua1
 * @Date 2024/8/13 08:05
 */
public class SelectSort {


    public static void main(String[] args) {

        int[] nums = {8, 9, 6, 7, 5, 4, 3, 2, 1};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void selectSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    minIndex = j;
                    min = nums[j];
                }
            }
            int temp = nums[i];
            nums[i] = min;
            nums[minIndex] = temp;
        }
    }
}
