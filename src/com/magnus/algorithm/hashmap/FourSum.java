package com.magnus.algorithm.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FourSum
 * @Description 18. 四数之和
 * 中等
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 *
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 * @Author yangchuanhua1
 * @Date 2024/9/21 17:07
 */
public class FourSum {



    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            // 剪枝操作
            if (nums[k] > target && nums[k] >= 0) {
                break;
            }
            // 去重
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            for (int i = k + 1; i < n; i++) {
                // 第二次剪枝
                if (nums[k] + nums[i] > target && nums[k] + nums[i] >= 0) {
                    break;
                }
                if (i > k + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = n - 1;
                while (right > left) {
                    long sum = (long) nums[k] + nums[i] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    }else if (sum < target) {
                        left++;
                    }else {
                        result.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
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

        }
        return result;
    }

}
