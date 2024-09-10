package com.magnus.algorithm;

/**
 * @ClassName RollBack
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/3 15:48
 */
public class RollBack {

    public int maxW = Integer.MIN_VALUE;

    public void f(int i, int cw, int[] items, int n, int w) {
        if (cw == w || i == n) {
            if (cw > maxW) {
                maxW = cw;
            }
            return;
        }
        f(i+1, cw, items, n, w);
        if (cw + items[i] <= w) {
            f(i+1, cw + items[i], items, n, w);
        }
    }

    public static void main(String[] args) {
        RollBack rollBack = new RollBack();
        int[] items = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        rollBack.f(0, 0, items, 10, 50);

        System.out.println(rollBack.maxW);
    }
}
