package com.magnus.algorithm.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ThreeSum
 * @Description 15. 三数之和
 * 中等
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 * @Author yangchuanhua1
 * @Date 2024/9/21 15:04
 */
public class ThreeSum {

    /**
     * 排序加双指针
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {

            int num = nums[i];
            // 如果第一个就大于 0 不会有三个数加起来为 0 的情况
            if (num > 0) {
                break;
            }
            // 重复的情况
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (right > left) {
                int sum = num + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                }else if (sum < 0) {
                    left++;
                }else {
                    result.add(Arrays.asList(num, nums[left], nums[right]));
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    while (right > left && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}
