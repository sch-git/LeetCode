package com.algorithm.simple;

/**
 * @Solution: 一次循环，增量累加
 * @Title: 买卖股票的最佳时机 II
 * @Description: 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * @Author: chenghao.su
 * @Date: 2020/3/7 10:31
 */
public class _122 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int sum = 0;
        int max = 0;
        int min = prices[0];
        int[] res = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = prices[i] - min;
                sum += max;
                min = prices[i];
            }
        }
        return sum;
    }
}
