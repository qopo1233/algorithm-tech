package com.magnus.algorithm.string;

import java.util.Scanner;

/**
 * @ClassName RightReverseString
 * @Description 右旋字符串
 * @Author yangchuanhua1
 * @Date 2024/9/22 20:33
 */
public class RightReverseString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();

        RightReverseString rightReverseString = new RightReverseString();
        String string = rightReverseString.rightReverseString(s, n);
        System.out.println(string);


    }

    public String rightReverseString(String s, int k) {
        char[] charArray = s.toCharArray();
        this.reverseStr(charArray, 0, charArray.length - 1);
        this.reverseStr(charArray, 0, k - 1);
        this.reverseStr(charArray, k, charArray.length - 1);
        return new String(charArray);
    }

    public void reverseStr(char[] chars, int start, int end) {

        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}
