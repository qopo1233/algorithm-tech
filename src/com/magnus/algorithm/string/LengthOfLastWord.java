package com.magnus.algorithm.string;

/**
 * @ClassName LengthOfLastWord
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/16 21:33
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String str) {
        int end = str.length() - 1;
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && str.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}
