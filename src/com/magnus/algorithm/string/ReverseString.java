package com.magnus.algorithm.string;

/**
 * @ClassName ReverseString
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/21 20:09
 */
public class ReverseString {

    public void reverseString(char[] s) {
        // 方法 1
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }

        // 方法 2
        int n = s.length - 1;
        for (int j = (n - 1) >> 1; j >= 0; j--) {
            int k = n - j;
            char temp = s[k];
            s[k] = s[j];
            s[j] = temp;
        }
    }

}
