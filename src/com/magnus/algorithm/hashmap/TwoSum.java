package com.magnus.algorithm.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum
 * @Description 1. 两数之和
 * 简单
 * 提示
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 *
 * 你可以按任意顺序返回答案。
 * @Author yangchuanhua1
 * @Date 2024/9/18 09:12
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                Integer index = map.get(temp);
                result[0] = i;
                result[1] = index;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
