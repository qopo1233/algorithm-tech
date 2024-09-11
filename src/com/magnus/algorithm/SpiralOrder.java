package com.magnus.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SpiralOrder
 * @Description 螺旋矩阵打印 54
 * @Author yangchuanhua1
 * @Date 2024/8/7 20:17
 */
public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        List<Integer> res = new ArrayList<>();
        while (true) {
            // left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // down
            if (++top > bottom) {
                break;
            }
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if (left > --right) {
                break;
            }
            // right to left
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            if (top > --bottom) {
                break;
            }
            // bottom to top
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }
}
