package com.magnus.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName HeapSort
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/13 11:15
 */
public class HeapSort {


    public static void main(String[] args) {
        int[] nums = {9,8,5,3,4,6,7,2,1,0};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void heapSort(int[] nums) {
        nums = buildBigHeap(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            adjustDownToUp(nums, 0, i);
        }
    }

    /** 构造大根堆
     * @param nums
     * @return
     */
    private static int[] buildBigHeap(int[] nums) {
        for (int i = (nums.length - 2)/ 2; i >= 0; i--) {
            adjustDownToUp(nums, i, nums.length);
        }
        return nums;
    }

    /**
     * 开始调整
     * @param nums
     * @param k
     * @param length
     */
    private static void adjustDownToUp(int[] nums, int k, int length) {

        int root = nums[k];
        for (int i = 2 * k + 1; i <= length - 1; i = 2 * i + 1) {
            if (i <= length - 2 && nums[i] < nums[i + 1]) {
                i++;
            }
            if (root >= nums[i]) {
                break;
            }else {
                nums[k] = nums[i];
                k = i;
            }
        }
        nums[k] = root;


    }
}
