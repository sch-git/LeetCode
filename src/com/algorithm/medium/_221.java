package com.algorithm.medium;

/**
 * @Solution: 动态规划
 * @Title: 最大正方形
 * @Description: 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * @Author: chenghao.su
 * @Date: 2020/3/7 09:50
 */
public class _221 {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{

                {'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}
        };
        maximalSquare(matrix);
    }

    public static int maximalSquare(char[][] matrix) {
        if (matrix.length < 1 || matrix[0].length < 1) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int max = Integer.MIN_VALUE;
        // 初始化第一行
        for (int i = 0; i < n; i++) {
            max = Math.max(matrix[0][i] - 48, max);
        }
        // 初始化第一列
        for (int i = 0; i < n; i++) {
            max = Math.max(matrix[i][0] - 48, max);
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                // 找到3个方向中最小的那个，保证全是一
                matrix[i][j] = (char) ((char) Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]) + 1);
                max = Math.max(matrix[i][j] - 48, max);
            }
        }
        return max * max;
    }
}
