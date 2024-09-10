package com.magnus.algorithm;

/**
 * @ClassName ReverseInt
 * @Description 整数反转
 * @Author yangchuanhua1
 * @Date 2024/8/15 20:15
 */
public class ReverseInt {


    public static void main(String[] args) {

        System.out.println(reverse(1302));

    }


    public static int reverse(int x) {

        int res = 0;
        while (x != 0) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }

            int digit = x % 10;
            res = res * 10 + digit;

            x = x / 10;

        }
        return res;
    }
}
