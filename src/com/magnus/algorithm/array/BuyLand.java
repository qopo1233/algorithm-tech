package com.magnus.algorithm.array;


import java.util.Scanner;

/**
 * @ClassName BuyLand
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/11 11:07
 */
public class BuyLand {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int sum = 0;
            int[][] vec = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    vec[i][j] = scanner.nextInt();
                    sum += vec[i][j];
                }
            }

            // 统计横向
            int[] horizontal = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    horizontal[i] += vec[i][j];
                }
            }

            // 统计纵向
            int[] vertical = new int[m];
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    vertical[j] += vec[i][j];
                }
            }

            int result = Integer.MAX_VALUE;
            int horizontalCut = 0;
            for (int i = 0; i < n; i++) {
                horizontalCut += horizontal[i];
                result = Math.min(result, Math.abs(sum - horizontalCut));
            }

            int verticalCut = 0;
            for (int j = 0; j < m; j++) {
                verticalCut += vertical[j];
                result = Math.min(result, Math.abs(sum - verticalCut));
            }

            System.out.println(result);
            scanner.close();
        }
    }
