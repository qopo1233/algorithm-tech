package com.magnus.algorithm.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Combine
 * @Description 77 回溯三部曲
 *  1、递归函数的参数和返回值
 *  2、终止条件
 *  3、单层搜索的过程
 * @Author yangchuanhua1
 * @Date 2024/9/9 11:36
 */
public class Combine {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {

    }

    public List<List<Integer>> combine(int n, int k) {

        int startIndex = 1;
        backTracking(n, k, startIndex);

        return result;
    }

    public void backTracking(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backTracking(n, k, i + 1);
            path.removeLast();
        }
    }

    /**
     * 剪枝操作
     * @param n
     * @param k
     * @param startIndex
     */
    public void backTrackingII(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backTrackingII(n, k, i + 1);
            path.removeLast();
        }
    }
}
