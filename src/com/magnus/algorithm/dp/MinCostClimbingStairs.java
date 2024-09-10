package com.magnus.algorithm.dp;

/**
 * @ClassName MinCostClimbingStairs
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/3 20:38
 */
public class MinCostClimbingStairs {


    /**
     * 动态规划 五个步骤
     * 1、数组的含义
     * 2、递推公式
     * 3、初始化
     * 4、循环遍历
     * 5、打印数组
     *
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
