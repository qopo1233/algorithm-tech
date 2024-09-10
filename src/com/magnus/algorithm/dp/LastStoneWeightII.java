package com.magnus.algorithm.dp;

import java.util.Enumeration;

/**
 * @ClassName LastStoneWeightII
 * @Description 1049
 * @Author yangchuanhua1
 * @Date 2024/9/9 09:47
 */
public class LastStoneWeightII {


    public static void main(String[] args) {
        LastStoneWeightII lastStoneWeightII = new LastStoneWeightII();

        System.out.println(lastStoneWeightII.lastStoneWeightII(new int[]{2, 8, 2, 2}));
    }


    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += stones[i];
        }

        int target = sum >> 1;
        int[] dp = new int[target + 1];
        for (int i = 0; i < n; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }

        return sum - 2 * dp[target];
    }
}
