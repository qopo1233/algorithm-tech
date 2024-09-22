package com.magnus.algorithm.string;

/**
 * @ClassName ReverseWords
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/22 17:58
 */
public class ReverseWords {

    public static void main(String[] args) {

        ReverseWords reverseWords = new ReverseWords();
        StringBuilder stringBuilder = reverseWords.removeExtraBlank(" wo  men   ");
        reverseWords.reverseStr(stringBuilder, 0, stringBuilder.length() - 1);
        reverseWords.reverseEveryWords(stringBuilder);
        System.out.println(stringBuilder);

    }

    private void reverseEveryWords(StringBuilder stringBuilder) {

        int start = 0;
        int end = 1;
        int n = stringBuilder.length();
        while (start < n) {
            while (end < n && stringBuilder.charAt(end) != ' ') {
                end++;
            }
            reverseStr(stringBuilder, start, end - 1);
            start = end + 1;
            end = start + 1;
        }

    }

    public String reverseWords(String s) {

        StringBuilder stringBuilder = removeExtraBlank(s);
        reverseStr(stringBuilder, 0, stringBuilder.length() - 1);
        reverseEveryWords(stringBuilder);

        return stringBuilder.toString();

    }


    /**
     * 去除前后的空格
     * @param s
     * @return
     */
    private StringBuilder removeExtraBlank(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (charArray[start] == ' ') {
            start++;
        }
        while (charArray[end] == ' ') {
            end--;
        }

        while (start <= end) {
            char ch = s.charAt(start);
            if (ch != ' ' || stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
                stringBuilder.append(charArray[start]);
            }
            start++;
        }
        return stringBuilder;
    }

    private void reverseStr(StringBuilder s, int start, int end) {
        while (start < end) {
            char temp = s.charAt(start);
            s.setCharAt(start, s.charAt(end));
            s.setCharAt(end, temp);
            start++;
            end--;
        }
    }

}
