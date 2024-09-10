package com.magnus.algorithm.string;

/**
 * @ClassName IsSubsequence
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/16 19:20
 */
public class IsSubsequence {


    public static void main(String[] args) {

        System.out.println(isSubsequence("cb", "acdefb"));
    }
    public static boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        if (n > m) {
            return false;
        }
        int left = 0, right = 0;
        while (left < n && right < m) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }
            right++;
        }
        return left == n;
    }
}
