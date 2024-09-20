package com.magnus.algorithm.hashmap;

/**
 * @ClassName IsAnagram
 * @Description 242. 有效的字母异位词
 * 简单
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的
 * 字母异位词
 * 。
 * @Author yangchuanhua1
 * @Date 2024/9/18 08:27
 */
public class IsAnagram {


    public static void main(String[] args) {
        System.out.println((int)'a' - 'a');
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            record[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < record.length; i++) {
            if (record[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
