package com.magnus.algorithm.string;

/**
 * @ClassName KMP
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/3 08:09
 */
public class KMP {


    public static void main(String[] args) {
        System.out.println("你好啊");
    }


    /**
     * 匹配字符串
     * @param a
     * @param n
     * @param b
     * @param m
     * @return
     */
    public static int kmp(char[] a, int n, char[] b, int m) {
        int[] next = getNext(b, m);
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j > 0 && a[i] != b[j]) {
                j = next[j - 1] + 1;
            }
            if (a[i] == b[j]) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

    /**
     * 获取 next 数组，失效函数
     * @param b
     * @param m
     * @return
     */
    private static int[] getNext(char[] b, int m) {
        // 初始化
        // 处理前后缀不相同的情况
        // 处理前后缀相同的情况
        int[] next = new int[m];
        int j = -1;
        next[0] = -1;
        for (int i = 1; i < m; i++) {
            while (j != -1 && b[j+1] != b[i]) {
                j = next[j];
            }
            if (b[j + 1] == b[i]) {
                ++j;
            }
            next[i] = j;
        }
        return next;
    }

    private int[] getNext2(char[] b, int m) {
        int[] next = new int[m];
        int j = -1;
        next[0] = -1;
        for (int i = 1; i < m; i++) {
            while (j != -1 && b[j + 1] != b[i]) {
                j = next[j];
            }
            if (b[j + 1] == b[i]) {
                ++j;
            }
            next[j] = j;
        }
        return next;
    }
}
