package com.algorithm.simple;

/**
 * @Title: 使用最小花费爬楼梯
 * @Description: 第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 * 在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 * @Author: chenghao.su
 * @Date: 2019/12/30 21:18
 */
public class _746 {
    public static void main(String[] args) {

    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[n - 1], cost[n - 2]);
    }
}
