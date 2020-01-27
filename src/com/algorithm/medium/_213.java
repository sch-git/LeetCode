package com.algorithm.medium;

/**
 * @Title: 打家劫舍 II
 * @Description: 这个地方所有的房屋都围成一圈
 * @Author: chenghao.su
 * @Date: 2020/1/27 12:53
 */
public class _213 {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dpa = new int[nums.length];
        int[] dpb = new int[nums.length];
        dpa[0] = nums[0];
        dpb[1] = nums[1];
        dpa[1] = Math.max(nums[0], nums[1]);
        dpb[2] = Math.max(nums[1], nums[2]);
        for (int i = 2; i < nums.length - 1; i++) {
            dpa[i] = Math.max(dpa[i - 2] + nums[i], dpa[i - 1]);
        }
        for (int i = 3; i < nums.length; i++) {
            dpb[i] = Math.max(dpb[i - 2] + nums[i], dpb[i - 1]);
        }
        return Math.max(dpa[nums.length - 2], dpb[nums.length - 1]);
    }
}
