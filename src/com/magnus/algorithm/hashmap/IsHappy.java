package com.magnus.algorithm.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName IsHappy
 * @Description 202. 快乐数
 * 简单
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」 定义为：
 *
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 *
 * @Author yangchuanhua1
 * @Date 2024/9/18 08:58
 */
public class IsHappy {


    public boolean isHappy(int n) {
        Set<Integer> sumSet = new HashSet<>();
        while (n != 1 && !sumSet.contains(n)) {
            sumSet.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }
    private int getNextNum(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }
}
