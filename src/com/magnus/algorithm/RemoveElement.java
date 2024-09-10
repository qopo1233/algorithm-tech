package com.magnus.algorithm;

/**
 * @ClassName RemoveElement
 * @Description TODO
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
