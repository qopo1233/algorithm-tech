package com.magnus.algorithm.heap;

import java.util.Arrays;

/**
 * @ClassName BigHeap
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/11 18:08
 */
public class BigHeap {


    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    private static int[] buildMaxHeap(int[] nums) {
        int length = nums.length;
        for (int i = (length - 2) / 2; i >= 0; i--) {
            heapify(nums, i, length);
        }
        return nums;
    }

    // 构造大根堆
    private static void heapify(int[] nums, int k, int length) {
        int temp = nums[k];
        for (int i = k * 2 + 1; i <= length - 1; i = i * 2 + 1) {
            if (i <= length - 2 && nums[i] < nums[i+1]) {
                i++;
            }
            if (temp >= nums[i]) {
                break;
            }else {
                nums[k] = nums[i];
                k = i;
            }
        }
        nums[k] = temp;
    }

    /**
     * 堆排序
     * @param nums
     */
    private static void heapSort(int[] nums) {
        nums = buildMaxHeap(nums);
        for (int i = nums.length - 1; i >= 1; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, 0, i);
        }

    }
}
