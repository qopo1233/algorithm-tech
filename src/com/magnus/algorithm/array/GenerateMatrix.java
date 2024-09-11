package com.magnus.algorithm.array;

import java.util.Arrays;

/**
 * @ClassName GenerateMatrix
 * @Description 59
 * 59. 螺旋矩阵 II
 * 中等
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * @Author yangchuanhua1
 * @Date 2024/9/10 14:16
 */
public class GenerateMatrix {

    public static void main(String[] args) {
        GenerateMatrix generateMatrix = new GenerateMatrix();
        int[][] ints = generateMatrix.generateMatrix(4);
        System.out.println(Arrays.toString(ints[1]));
    }
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int left = 0;
        int right = n - 1;

        int top = 0;
        int bottom = n - 1;

        int k = n * n;
        int num = 1;
        while (num <= k) {
            for (int i = left; i <= right; i++) {
                result[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = num++;
            }
            left++;
        }
        return result;
    }


}
