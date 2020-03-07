package com.algorithm.medium;

import java.util.Arrays;

/**
 * @Solution: 动态规划
 * @Title: 最长上升子序列
 * @Description: 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * @Author: chenghao.su
 * @Date: 2020/3/7 11:20
 */
public class _300 {
    public static void main(String[] args) {

    }

    // 动态规划
    public int lengthOfLIS(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
