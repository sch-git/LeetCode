package com.algorithm.medium;

;

/**
 * @Title: 最小路径和
 * @Description: 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * @Author: chenghao.su
 * @Date: 2019/12/15 22:52
 */
public class _64 {
    public static void main(String[] args) {
        int[][] map = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(minPathSum(map));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // 初始化第一行
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }
        // 初始化第一列
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
