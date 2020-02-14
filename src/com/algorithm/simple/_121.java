package com.algorithm.simple;

/**
 * @Title: 买卖股票的最佳时机
 * @Description: 它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * @Author: chenghao.su
 * @Date: 2020/2/14 23:26
 */
public class _121 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int[] result = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                result[i] = prices[i] - min;
            } else {
                min = prices[i];
            }
            result[i] = Math.max(result[i], result[i - 1]);
        }
        return result[prices.length - 1];
    }
}
