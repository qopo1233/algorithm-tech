package com.magnus.algorithm;

/**
 * @ClassName MergeArray
 * @Description 合并两个有序数组
 * @Author yangchuanhua1
 * @Date 2024/8/6 15:49
 */
public class MergeArray {

    public static void main(String[] args) {

        int[] a = new int[6];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        int[] b = new int[]{2, 4, 6};
        merge(a, 3, b, 3);
        for (int i : a) {
            System.out.println(i);
        }
    }


    public static void merge(int[] a, int m, int[] b, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            a[k--] = a[i] > b[j] ? a[i--] : b[j--];
        }

        while (j >= 0) {
            a[k--] = b[j--];
        }
    }
}
