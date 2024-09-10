package com.magnus.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LengthOfLongestSubstring
 * @Description 无重复字符串的最长字串
 * @Author yangchuanhua1
 * @Date 2024/8/8 17:40
 */
public class LengthOfLongestSubstring {


    public static void main(String[] args) {

    }


    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> characterIndexMap = new HashMap<>();

        int maxLength = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {

            if (characterIndexMap.containsKey(s.charAt(i))) {
                left = Math.max(left, characterIndexMap.get(s.charAt(i)) + 1);
            }
            characterIndexMap.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);
        }


        return maxLength;


    }
}
