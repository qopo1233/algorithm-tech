package com.magnus.algorithm.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Intersection
 * @Description 349. 两个数组的交集
 * 简单
 * 给定两个数组 nums1 和 nums2 ，返回 它们的
 * 交集
 *  。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * @Author yangchuanhua1
 * @Date 2024/9/18 08:49
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        return set2.stream().mapToInt(x -> x).toArray();
    }
}
