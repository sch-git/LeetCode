package com.offer;

/**
 * @Solution:
 * @Title: 顺时针打印矩阵
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/29 10:49
 */
public class _29 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
//                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        spiralOrder(matrix);
    }

    public static int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m < 1) {
            return new int[0];
        }
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int key = 0;
        int circle = 0;
        for (int k = 0; k < m * n; ) {
            // 右
            if (key == 0) {
                for (int j = circle; j <= n - 1 - circle && k < m * n; j++) {
                    result[k++] = matrix[circle][j];
                }
                key = 1;
                continue;
            }
            // 下
            if (key == 1) {
                for (int i = circle + 1; i < m - 1 - circle && k < m * n; i++) {
                    result[k++] = matrix[i][n - 1 - circle];
                }
                key = 2;
                continue;
            }
            // 左
            if (key == 2) {
                for (int j = n - 1 - circle; j > circle && k < m * n; j--) {
                    result[k++] = matrix[m - 1 - circle][j];
                }
                key = 3;
                continue;
            }
            // 上
            if (key == 3) {
                for (int i = m - 1 - circle; i > circle && k < m * n; i--) {
                    result[k++] = matrix[i][circle];
                }
                key = 0;
            }
            circle++;
        }
        return result;
    }
}