package com.offer;

/**
 * @Solution: 二重循环
 * @Title: 滑动窗口的最大值
 * @Description: 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * @Author: chenghao.su
 * @Date: 2020/3/10 14:56
 */
public class _59_I {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        if (nums.length < 1) {
            return result;
        }
        int max;
        for (int i = 0; i < nums.length - k + 1; i++) {
            max = nums[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }
        return result;
    }
}
