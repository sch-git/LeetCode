package com.algorithm.simple;

/**
 * @Description: 动态规划练习：连续子数组最大和
 * @Author: chenghao.su
 * @Date: 2020/3/30 16:11
 */
public class _16_17 {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int max = nums[0];
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = Math.max(result[i - 1] + nums[i], nums[i]);
            max = Math.max(max, result[i]);
        }
        return max;
    }
}
