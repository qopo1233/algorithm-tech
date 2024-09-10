package com.magnus.algorithm.dp;

/**
 * @ClassName CanPartition
 * @Description 416
 * @Author yangchuanhua1
 * @Date 2024/9/8 11:36
 */
public class CanPartition {


    public static void main(String[] args) {
        CanPartition canPartition = new CanPartition();
        System.out.println(canPartition.canPartition(new int[]{1, 7, 2, 8}));
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // 奇数
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
            if (dp[target] == target) {
                return true;
            }
        }
        return dp[target] == target;

    }
}
