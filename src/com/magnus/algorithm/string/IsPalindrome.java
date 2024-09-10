package com.magnus.algorithm.string;

/**
 * @ClassName IsPalindrome
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/16 19:09
 */
public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("AB1C1BA"));
    }

    public static boolean isPalindrome(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            boolean letterOrDigit = Character.isLetterOrDigit(charAt);
            if (letterOrDigit) {
                stringBuilder.append(Character.toLowerCase(charAt));
            }
        }

        int left = 0, right = stringBuilder.length() - 1;

        while (left <= right) {
            if (stringBuilder.charAt(left) != stringBuilder.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
