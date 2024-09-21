package com.magnus.algorithm.hashmap;

/**
 * @ClassName CanConstruct
 * @Description 383. 赎金信
 * 简单
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * @Author yangchuanhua1
 * @Date 2024/9/21 10:09
 */
public class CanConstruct {

    public static void main(String[] args) {
        CanConstruct canConstruct = new CanConstruct();
        System.out.println(canConstruct.canConstruct("aa", "aab"));
    }


    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] records = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            records[magazine.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            records[ransomNote.charAt(i) - 'a'] -= 1;
        }

        for (int i = 0; i < records.length; i++) {
            if (records[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
