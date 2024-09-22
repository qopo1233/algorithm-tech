package com.magnus.algorithm.string;

/**
 * @ClassName ReplaceNumber
 * @Description 把字符串中的数字替换成number
 * @Author yangchuanhua1
 * @Date 2024/9/22 12:09
 */
public class ReplaceNumber {


    public static void main(String[] args) {
        ReplaceNumber replaceNumber = new ReplaceNumber();
        System.out.println(replaceNumber.replaceNumber("ni1hao2"));
    }

    public String replaceNumber(String s) {
        int numberCount = 0;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                numberCount++;
            }
        }
        char[] newchar = new char[s.length() + numberCount * 5];
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                newchar[j] = charArray[i];
                j++;
            }else {
                newchar[j] = 'n';
                newchar[j + 1] = 'u';
                newchar[j + 2] = 'm';
                newchar[j + 3] = 'b';
                newchar[j + 4] = 'e';
                newchar[j + 5] = 'r';
                j += 6;
            }
        }
        return new String(newchar);
    }
}
