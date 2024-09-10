package com.magnus.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName MerSort
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/15 15:58
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {10, 7, 8, 9, 1, 5};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


    public static void mergeSort(int[] nums, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (i = 0; i < k; i++) {
            nums[left + i] = temp[i];
        }
    }


}
