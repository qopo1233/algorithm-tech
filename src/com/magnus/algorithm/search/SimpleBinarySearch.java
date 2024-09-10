package com.magnus.algorithm.search;

/**
 * @ClassName SimpleBinarySearch
 * @Description 二分查找
 * @Author yangchuanhua1
 * @Date 2024/8/26 08:44
 */
public class SimpleBinarySearch {


    public static void main(String[] args) {

    }

    public static int binarySearch(int[] nums, int value) {


        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == value) {
                return mid;
            }else if (nums[mid] > value) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchInternally(int[] nums, int low, int high, int value) {
        if (low < high) {
            return -1;
        }
        int mid = (low + (high - low) >> 1);
        if (nums[mid] == value) {
            return mid;
        }else if (nums[mid] > value) {
            return binarySearchInternally(nums, low, mid - 1, value);
        }else {
            return binarySearchInternally(nums, mid + 1, high, value);
        }
    }


}
