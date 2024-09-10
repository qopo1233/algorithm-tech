package com.magnus.algorithm;

/**
 * @ClassName Sqrt
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/26 09:35
 */
public class Sqrt {


    public static void main(String[] args) {
        System.out.println(sqrt(4, 0.000001));
    }


    public static double sqrt(double x, double precision) {
        if (x < 0) {
            return -1;
        }
        double low = 1, high = x;
        if (x > 0 && x < 1) {
            low = x;
            high = 1;
        }
        while (low <= high) {
            double mid = low + (high - low) / 2;
            if (Math.abs(mid * mid -x) <= precision) {
                return mid;
            }else if (mid * mid > x) {
                high = mid;
            }else if (mid * mid < x) {
                low = mid;
            }
        }
        return -1;

    }
}
