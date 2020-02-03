package com.algorithm.medium;

/**
 * @Title: 零钱兑换
 * @Description: 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * @Author: chenghao.su
 * @Date: 2020/2/3 12:40
 */
public class _322 {
    public static void main(String[] args) {

    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    if (dp[i - coins[j]] != Integer.MAX_VALUE) {
                        temp = Math.min(dp[i - coins[j]] + 1, temp);
                    }
                }
            }
            dp[i] = temp;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
