package com.magnus.algorithm.string;

/**
 * @ClassName LongestCommonPrefix
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/16 21:20
 */
public class LongestCommonPrefix {


    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }


    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if (ans.equals("")) {
                return "";
            }

        }

        return ans;

    }
}
