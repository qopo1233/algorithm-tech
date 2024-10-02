package com.magnus.algorithm.string;

/**
 * @ClassName RepeatedSubstringPattern
 * @Description 459. 重复的子字符串
 * 简单
 * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 * @Author yangchuanhua1
 * @Date 2024/10/2 20:50
 */
public class RepeatedSubstringPattern {


    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("abcabca"));
    }

    public boolean repeatedSubstringPattern(String s) {
        int[] next = new int[s.length()];
        int len = s.length();
        int j = -1;
        next[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
                j = next[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
        if (next[len - 1] != -1 && len % (len - (next[len - 1] + 1)) == 0) {
            return true;
        }

        return false;
    }
}
