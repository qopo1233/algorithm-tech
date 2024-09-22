package com.magnus.algorithm.string;

/**
 * @ClassName reverseStr
 * @Description 541. 反转字符串 II
 * 简单
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 *
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * @Author yangchuanhua1
 * @Date 2024/9/22 07:36
 */
public class reverseStr {

    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int start = 0;
        int length = s.length();
        while (start < length) {
            StringBuilder temp = new StringBuilder();
            int firstK = Math.min((start + k), length);
            int secondK = Math.min((start + 2 * k), length);
            temp.append(s.substring(start, firstK));
            res.append(temp.reverse());
            if (firstK < secondK) {
                res.append(s.substring(firstK, secondK));
            }
            start += (2 * k);
        }
        return res.toString();
    }

}
