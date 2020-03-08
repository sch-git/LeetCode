package com.algorithm.difficult;

/**
 * @Solution: 动态规划-自底向上
 * @Title: 地下城游戏
 * @Description: 骑士的初始健康点数为一个正整数。如果他的健康点数在某一时刻降至 0 或以下，他会立即死亡。
 * 地下城是由 M x N 个房间组成的二维网格。
 * 任何房间都可能对骑士的健康点数造成威胁，也可能增加骑士的健康点数，包括骑士进入的左上角房间以及公主被监禁的右下角房间。
 * @Author: chenghao.su
 * @Date: 2020/3/8 21:46
 */
public class _174 {
    public static void main(String[] args) {
        int[][] dun = new int[][]{
                {-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}
        };
        calculateMinimumHP(dun);
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - dungeon[i][n - 1]);
        }
        for (int j = n - 2; j >= 0; j--) {
            dp[m - 1][j] = Math.max(1, dp[m - 1][j + 1] - dungeon[m - 1][j]);
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = Math.max(1, Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dp[0][0];
    }
}
