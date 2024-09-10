package com.magnus.algorithm.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName CombinationSum3
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/9 13:52
 */
public class CombinationSum3 {


    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    /**
     *
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrackingSum(n , k, 1, 0);
        return result;
    }

    public void backTrackingSum(int n, int k, int startIndex, int sum) {
        // 减枝
        if (sum > n) {
            return;
        }
        if (path.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        // 减枝操作
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            backTrackingSum(n, k, i + 1, sum);
            sum -= i;
            path.removeLast();
        }
    }
}
