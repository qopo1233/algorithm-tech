package com.magnus.algorithm.dp;

/**
 * @ClassName KancksackProblem
 * @Description 背包问题
 * @Author yangchuanhua1
 * @Date 2024/9/5 21:16
 */
public class KnapsackProblem {


    public static void main(String[] args) {
        KnapsackProblem knapsackProblem = new KnapsackProblem();
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int i = knapsackProblem.knapsackProblem(weight, value, 4);
        System.out.println("一维数组:" + i);

        int i1 = knapsackProblem.knapsackProblemOneLevel(weight, value, 4);
        System.out.println("二维数组:" + i1);
    }
    /**
     * 动归五部曲
     * 1、dp 数组的含义 i 物品，j 重量 dp[i][j] 为价值
     * 2、递推公式
     * 3、数组初始化
     * 4、循环遍历
     * 5、打印数组
     * @param weight
     * @param value
     * @return
     */
    public int knapsackProblem(int[] weight, int[] value, int bagweight) {
        int m = weight.length;// 物品
        int n = bagweight + 1;// 重量
        int[][] dp = new int[m][n];

        //初始化
        for(int j = 0; j < weight[0]; j++) {
            dp[0][j] = 0;
        }
        for (int j = weight[0]; j <= bagweight; j++) {
            dp[0][j] = value[0];
        }

        for(int i = 1; i < m; i++) {
            for (int j = 0; j <= bagweight; j++) {
                if (j < weight[i]) {
                    dp[i][j] = dp[i - 1][j];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                }
            }
        }
        return dp[m - 1][bagweight];
    }

    /**
     * 背包问题一维数组
     * 动归五部曲
     * 1、dp 数组的含义 j 重量所能包含物品的最大价值
     * 2、递推公式
     * 3、dp 数组的初始化
     * 4、循环便利
     * 5、打印数组
     * @param weight
     * @param value
     * @param bagweight
     * @return
     */
    public int knapsackProblemOneLevel(int[] weight, int[] value, int bagweight) {
        int[] dp = new int[bagweight + 1];
        int length = weight.length;

        for (int i = 0; i < length; i++) {
            for (int j = bagweight; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }

        return dp[bagweight];

    }

}
