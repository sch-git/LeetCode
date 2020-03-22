package com.exam.crazy;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/22 10:15
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n + 1];
        int[] coins = new int[]{1, 4, 5};
        int[] num = new int[6];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                if (i >= coins[j]) {
                    if (dp[i - coins[j]] + 1 <= min) {
                        min = dp[i - coins[j]] + 1;
                        if (i % 4 == 0) {
                            num[4] = i / 4;
                            num[1] = 0;
                            num[5] = 0;
                        } else if (i % 5 == 0) {
                            num[1] = 0;
                            num[4] = 0;
                            num[5] = i / 5;
                        } else {
                            num[1] = i;
                            num[4] = num[1] / 4;
                            num[1] = num[1] % 4;
                            num[5] = Math.min(num[1], num[4]);
                            num[1] -= num[5];
                            num[4] -= num[5];
                        }
                    }
                }
            }
            dp[i] = min;
        }
        System.out.printf("%d,%d,%d", num[1], num[4], num[5]);
    }
}
