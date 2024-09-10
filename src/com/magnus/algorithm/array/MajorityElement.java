package com.magnus.algorithm.array;

/**
 * @ClassName MajorityElement
 * @Description 大多数大元素-摩尔投票法
 * @Author yangchuanhua1
 * @Date 2024/8/16 20:08
 */
public class MajorityElement {


    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        int x = 0, votes = 0;

        for (int num : nums) {
            if (votes == 0) {
                x = num;
            }
            votes += x == num ? 1 : -1;
        }
        return x;


    }
}
