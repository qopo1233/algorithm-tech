package com.magnus.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/9 07:09
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = {5,2,3,1};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortArray(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            boolean flag = false;
            for (int j = length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return nums;
    }
}
