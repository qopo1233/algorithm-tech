package com.magnus.algorithm.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FourSumCount
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/18 21:34
 */
public class FourSumCount {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> twoSumCount = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                twoSumCount.put(sum, twoSumCount.getOrDefault(sum, 0) + 1);
            }
        }

        int res = 0;
        for (int i : nums3) {
            for (int j : nums4) {
                int sum = i + j;
                res += twoSumCount.getOrDefault(0 - sum, 0);
            }
        }
        return res;
    }
}
