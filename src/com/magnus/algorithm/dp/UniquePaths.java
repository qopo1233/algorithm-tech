package com.magnus.algorithm.dp;

/**
 * @ClassName UniquePaths
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/4 09:02
 */
public class UniquePaths {


    /**
     * 动态规划五部曲
     * 1、dp 数组含义
     * 2、递推公式
     * 3、初始化
     * 4、遍历
     * 5、打印数组
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        // dp[i][j]代表的是有多少路径能到达
        int[][] dp = new int[m][n];

        // 递推公式，因为只能向右和向下，
        // dp[i][j] = dp[i-1][j] + dp[i][j-1];
        // 初始化
        for(int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[j][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m - 1][n - 1];

    }
}
