package com.magnus.algorithm.dp;

/**
 * @ClassName UniquePathsWithObstacles
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/4 12:51
 */
public class UniquePathsWithObstacles {


    /**
     * 动态规划五部曲
     * 1、dp 数组的含义
     * 2、递推公式
     * 3、dp 数组的初始化
     * 4、循环遍历
     * 5、数组打印
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        int[][] dp = new int[m][n];

        for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++) {
            dp[0][i] = 1;
        }
        for (int j = 0; j < m && obstacleGrid[j][0] == 0; j++) {
            dp[j][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {

                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];

    }
}
