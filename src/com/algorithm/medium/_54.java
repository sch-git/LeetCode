package com.algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 螺旋矩阵
 * @Description: 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * @Author: chenghao.su
 * @Date: 2020/1/3 19:40
 */
public class _54 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length <= 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int key = Math.min(m, n);
        int time = 0;

        while (key > 0) {
            key -= 2;
            int i = time;
            int j = time;
            for (; j < n - time; j++) {
                result.add(matrix[i][j]);
            }
            for (i++, j--; i < m - time; i++) {
                result.add(matrix[i][j]);
            }
            for (i--, j--; j >= time && 2 * time + 1 < m; j--) {
                result.add(matrix[i][j]);
            }
            for (i--, j++; i > time && 2 * time + 2 < m && 2 * time + 1 < n; i--) {
                result.add(matrix[i][j]);
            }
            time++;
        }
        return result;
    }
}
