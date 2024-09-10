package com.magnus.algorithm.dp;

import java.util.Arrays;

/**
 * @ClassName NumTrees
 * @Description 96
 * @Author yangchuanhua1
 * @Date 2024/9/4 14:06
 */
public class NumTrees {

    public static void main(String[] args) {
        NumTrees numTrees = new NumTrees();
        System.out.println(numTrees.numTrees(3));
    }
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
