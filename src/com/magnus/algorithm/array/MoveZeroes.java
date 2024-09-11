package com.magnus.algorithm.array;

import com.magnus.algorithm.Node;

/**
 * @ClassName MoveZero
 * @Description 283
 *  给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * @Author yangchuanhua1
 * @Date 2024/9/10 12:27
 */
public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {1, 0, 2, 0};
        moveZeroes.moveZeroes(nums);
        System.out.println(nums);
    }
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex] = nums[fastIndex];
                if (fastIndex != slowIndex) {
                    nums[fastIndex] = 0;
                }
                slowIndex++;
            }
        }
    }


}
