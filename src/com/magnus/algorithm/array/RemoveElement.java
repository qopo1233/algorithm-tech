package com.magnus.algorithm.array;

/**
 * @ClassName RemoveElement
 * @Description
27. 移除元素
已解答
简单
相关标签
相关企业
提示
给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。

假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：

更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
返回 k。
 * @Author yangchuanhua1
 * @Date 2024/8/6 19:25
 */
public class RemoveElement {


    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }

    public int removeElementSlowAndFast(int[] nums, int value) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != value) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
