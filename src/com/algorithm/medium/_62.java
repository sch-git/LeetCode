package com.algorithm.medium;

;

/**
 * @Title: 不同路径
 * @Description: 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 * @Author: chenghao.su
 * @Date: 2019/12/15 14:00
 */
public class _62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
    }

    public static int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];
        // 初始化第一行
        for (int j = 0; j < n; j++) {
            result[0][j] = 1;
        }
        // 初始化第一列
        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }
        return result[m - 1][n - 1];
    }
}
