package com.algorithm.medium;

;

/**
 * @Title: 不同路径 II
 * @Description:一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径
 * @Author: chenghao.su
 * @Date: 2019/12/15 22:33
 */
public class _63 {
    public static void main(String[] args) {
        int[][] map = {
                {1, 0},
        };
        System.out.println(uniquePathsWithObstacles(map));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] result = new int[m][n];
        // 初始化第一行
        for (int j = 0; j < n; j++) {
            if (j == 0) {
                result[0][j] = obstacleGrid[0][j] == 1 ? 0 : 1;
            } else {
                result[0][j] = obstacleGrid[0][j] == 1 ? 0 : result[0][j - 1];
            }
        }
        // 初始化第一列
        for (int i = 0; i < m; i++) {
            if (i == 0) {
                result[i][0] = obstacleGrid[i][0] == 1 ? 0 : 1;
            } else {
                result[i][0] = obstacleGrid[i][0] == 1 ? 0 : result[i - 1][0];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = obstacleGrid[i][j] == 1 ? 0 : result[i - 1][j] + result[i][j - 1];
            }
        }
        return result[m - 1][n - 1];
    }
}
