package com.magnus.algorithm.string;

/**
 * @ClassName StrStr
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/23 20:48
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = getNext(needle);
        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) {
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j + 1)) {
                j++;
            }
            if (j == needle.length() - 1) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    private int[] getNext(String needle) {
        int n = needle.length();
        int[] next = new int[n];
        int j = -1;
        next[0] = -1;
        for (int i = 1; i < n; i++) {
            while (j != -1 && needle.charAt(j + 1) != needle.charAt(i)) {
                j = next[j];
            }
            if (needle.charAt(j + 1) == needle.charAt(i)) {
                ++j;
            }
            next[i] = j;
        }
        return next;
    }
}
