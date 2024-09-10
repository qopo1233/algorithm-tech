package com.magnus.algorithm.sort;

/**
 * @ClassName CountingSort
 * @Description 计数排序
 * @Author yangchuanhua1
 * @Date 2024/8/25 20:23
 */
public class CountingSort {


    public static void main(String[] args) {

    }



    public static void countingSort(int[] nums, int n) {
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(nums[i], max);
        }
        int[] c = new int[max + 1];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            c[num] += 1;
        }
        for (int i = 1; i <= max; i++) {
            c[i] = c[i - 1] + c[i];
        }
        int[] r = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int index = c[nums[i]] - 1;
            r[index] = nums[i];
            c[nums[i]]--;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = r[i];
        }

    }
}
