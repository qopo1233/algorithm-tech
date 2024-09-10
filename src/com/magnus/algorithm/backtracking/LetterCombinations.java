package com.magnus.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName LetterCombinations
 * @Description 回溯算法三部曲
 * 1、确定参数和函数
 * 2、终止条件
 * 3、单次循环
 * @Author yangchuanhua1
 * @Date 2024/9/9 21:44
 */
public class LetterCombinations {


    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        List<String> strings = letterCombinations.letterCombinations("23");

        System.out.println(strings.stream().collect(Collectors.joining()));
    }

    List<String> result = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] numMapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


        backTracking(digits, numMapping, 0);
        return result;
    }

    private void backTracking(String digits, String[] numMapping, int nums) {
        if (digits.length() == nums) {
            result.add(stringBuilder.toString());
            return;
        }
        int index = digits.charAt(nums) - '0';
        String str = numMapping[index];
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            // 递归处理下一层
            backTracking(digits, numMapping, nums + 1);
            // 剔除末尾的继续尝试
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
