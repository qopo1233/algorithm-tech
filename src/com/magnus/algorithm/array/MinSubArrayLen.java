package com.magnus.algorithm.array;

/**
 * @ClassName MinSubArrayLen
 * @Description
 * 209. 长度最小的子数组
 * 中等
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其总和大于等于 target 的长度最小的
 * 子数组
 *  [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0
 * @Author yangchuanhua1
 * @Date 2024/9/10 12:53
 */
public class MinSubArrayLen {

    /**
     * 查找连续的子数组用滑动窗口
     * @param args
     */
    public static void main(String[] args) {
        MinSubArrayLen minSubArrayLen = new MinSubArrayLen();
        int[] nums = {2,3,1,2,4,3};
        int i = minSubArrayLen.minSubArrayLen(7, nums);
        System.out.println(i);
    }

    // 滑动窗口
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, (right - left) + 1);
                sum -= nums[left++];
            }
        }
        return Integer.MAX_VALUE == result ? 0 : result;
    }


}
