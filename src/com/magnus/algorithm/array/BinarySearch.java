package com.magnus.algorithm.array;

import com.magnus.algorithm.BinaryTreeNode;

/**
 * @ClassName BinarySearch
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/11 13:17
 */
public class BinarySearch {


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int search = binarySearch.search(new int[]{1, 2, 9, 10, 25, 50}, 10);
        System.out.println(search);
    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
