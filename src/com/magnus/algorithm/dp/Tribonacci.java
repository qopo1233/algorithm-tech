package com.magnus.algorithm.dp;

/**
 * @ClassName Tribonacci
 * @Description 1137
 * @Author yangchuanhua1
 * @Date 2024/9/4 14:35
 */
public class Tribonacci {


    public static void main(String[] args) {

        System.out.println(new Tribonacci().tribonacci(3));
    }

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}
