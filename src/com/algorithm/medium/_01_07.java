package com.algorithm.medium;

/**
 * @Title: 旋转矩阵
 * @Solution:
 * @Description: 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 * @Author: chenghao.su
 * @Date: 2020/4/7 14:31
 */
public class _01_07 {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // 按中间行对称翻转
        int mid = n >> 1;
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
        // 按左上-右下 对角线进行翻转
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
