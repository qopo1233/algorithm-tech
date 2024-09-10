package com.magnus.algorithm.dp;

import java.util.Arrays;

/**
 * @ClassName IntegerBreak
 * @Description 343
 * @Author yangchuanhua1
 * @Date 2024/9/4 13:41
 */
public class IntegerBreak {

    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();

        System.out.println(integerBreak.integerBreak(10));
    }

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
