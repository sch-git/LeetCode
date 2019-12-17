package com.algorithm.simple;

;

/**
 * @Title: 最大子序和
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 * @Author: chenghao.su
 * @Date: 2019/12/17 20:31
 */
public class _53 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                -2, -3, -1, -5
        };
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        if (nums.length <= 1) {
            return nums[nums.length - 1];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(maxSum, nums[i]);
        }
        return maxSum;
    }
}
