package com.magnus.algorithm.array;

import java.util.Scanner;

/**
 * @ClassName PrefixSum
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/11 10:09
 */
public class PrefixSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] p = new int[n];
        int preSum = 0;
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            array[i] = input;
            preSum += array[i];
            p[i] = preSum;
        }
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = 0;
            if (a == 0) {
                sum = p[b];
            }else {
                sum = p[b] - p[a - 1];
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
