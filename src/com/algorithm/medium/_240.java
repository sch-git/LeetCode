package com.algorithm.medium;

/**
 * @Title: 搜索二维矩阵 II
 * @Description: 搜索 m x n 矩阵 matrix 中的一个目标值 target
 * 每行的元素从左到右升序排列。每行的元素从左到右升序排列。
 * @Author: chenghao.su
 * @Date: 2020/2/13 20:59
 */
public class _240 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{

        };
        searchMatrix(matrix, 20);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m < 1) {
            return false;
        }
        int n = matrix[0].length;
        if (n < 1) {
            return false;
        }
        for (int i = 0, j = n - 1; i < m && j >= 0; ) {
            if (target > matrix[i][j]) {
                i++;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
