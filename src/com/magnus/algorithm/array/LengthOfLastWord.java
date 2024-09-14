package com.magnus.algorithm.array;

/**
 * @ClassName LengthOfLastWord
 * @Description 58
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串
 * @Author yangchuanhua1
 * @Date 2024/9/11 12:47
 */
public class LengthOfLastWord {

    public static void main(String[] args) {

    }


    /**
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {

        // 先找到不是空格的最后一个单词的末尾
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index--;
        }
        return wordLength;

    }
}
