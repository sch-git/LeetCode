package com.algorithm.every;

/**
 * @Title: 最大子序和
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @Author: chenghao.su
 * @Date: 2020/5/3 15:27
 */
public class _53 {
    public static void main(String[] args) {

    }

    /**
     * 1.如果当前值 > sum+当前值,则更新 sum 为当前值;表示以当前为起始位置
     * 2.否则 sum+=当前值,将 sum 和 max 对比;
     *
     * @param nums 数组
     * @return 最大子序和
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > sum) {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
