package com.magnus.algorithm.dp;

/**
 * @ClassName Fib
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/7 16:48
 */
public class Fib {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        int fib1 = fib.fib(3);
        System.out.println(fib1);
    }
}
