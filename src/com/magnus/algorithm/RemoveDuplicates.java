package com.magnus.algorithm;

/**
 * @ClassName RemoveDuplicates
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/16 18:30
 */
public class RemoveDuplicates {


    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int slow =1,  fast = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
