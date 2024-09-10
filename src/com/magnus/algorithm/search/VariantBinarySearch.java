package com.magnus.algorithm.search;

/**
 * @ClassName VarityBinarySearch
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/26 11:02
 */
public class VariantBinarySearch {


    public static void main(String[] args) {
        VariantBinarySearch variantBinarySearch = new VariantBinarySearch();

        int[] nums = {1 ,3 ,4, 5, 6, 8, 8, 8, 11, 18};
        System.out.println("查找第一个值等于给定值的元素下标：" + variantBinarySearch.firstBinarySearch(nums, nums.length, 8));
        System.out.println("查找最后一个值等于给定值的元素下标:" + variantBinarySearch.lastBinarySearch(nums, nums.length, 8));
        System.out.println("查找第一个值大于等于给定值的元素下标:" + variantBinarySearch.firstBiggerEqualsBinarySearch(nums, nums.length, 7));
        System.out.println("查找最后一个值小于等于给定值的元素下标:" + variantBinarySearch.lastLittlerEqualsBinarySearch(nums, nums.length, 10));

        int[] cycleBSearch = {4, 5, 6, 1, 2, 3};
        System.out.println(variantBinarySearch.cycleArrayBSearch(cycleBSearch, 6));
    }
    /**
     * 查找第一个值等于给定值的元素
     * @param nums
     * @param n
     * @return
     */
    public int firstBinarySearch(int[] nums, int n, int value) {
        int low = 0;
        int high = n -1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > value) {
                high = mid - 1;
            }else if (nums[mid] < value) {
                low = mid + 1;
            }else {
                if (mid == 0 || nums[mid - 1] != value) {
                    return mid;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找第一个值大于等于给定值的元素下标
     * @param nums
     * @param n
     * @param value
     * @return
     */
    public int firstBiggerEqualsBinarySearch(int[] nums, int n, int value) {
        int low = 0;
        int high = n -1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] >= value) {
                if(mid == 0 || nums[mid - 1] < value) {
                    return mid;
                }else {
                    high = mid - 1;
                }
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 查找最后一个值等于给定值的元素
     * @param nums 数组
     * @param n 数组长度
     * @param value 给定的值
     * @return
     */
    public int lastBinarySearch(int[] nums, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > value) {
                high = mid - 1;
            }else if (nums[mid] < value) {
                low = mid + 1;
            }else {
                if (mid == (n -1) || nums[mid + 1] != value) {
                    return mid;
                }else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找最后一个值小于等于给定值的元素
     * @param nums 数组
     * @param n 数组长度
     * @param value 给定的值
     * @return
     */
    public int lastLittlerEqualsBinarySearch(int[] nums, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > value) {
                high = mid - 1;
            }else if (nums[mid] <= value) {
                if (mid == (n - 1) || nums[mid + 1] > value) {
                    return mid;
                }else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    /**
     * 循环有序数组二分查找
     * 1、如果是单调递增的用普通二分查找
     * 2、如果不是那么就找临界点
     * @param nums
     * @param value
     * @return
     */
    public int cycleArrayBSearch(int[] nums, int value) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[low] < nums[high]) {
                if (nums[mid] < value) {
                    low = mid + 1;
                }else if (nums[mid] > value) {
                    high = mid - 1;
                }else {
                    return mid;
                }
            }else {
                if (nums[low] == value) {
                    return low;
                }
                if (nums[high] == value) {
                    return high;
                }
                if (nums[high] < value && nums[low] > value) {
                    return -1;
                }else if (nums[high] > value) {
                    high--;
                }else {
                    low++;
                }
            }
        }
        return -1;
    }


}
