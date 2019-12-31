package com.nk.bili2020;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2019/12/31 15:23
 */
public class _3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] weight = new int[N];
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            value[i] = in.nextInt();
        }
        int[][] dp = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (j >= weight[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[N][M]);
    }
}
