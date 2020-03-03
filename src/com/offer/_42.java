package com.offer;

/**
 * @Solution: 判断当前节点和以之前节点结尾的最值+当前节点的值的大小
 * @Title: 连续子数组的最大和
 * @Description: 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * <p>
 * 要求时间复杂度为O(n)
 * @Author: chenghao.su
 * @Date: 2020/3/3 19:51
 */
public class _42 {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        // result[i]表示以i结尾的数的最大值
        int[] result = new int[nums.length];
        result[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = Math.max(result[i - 1] + nums[i], nums[i]);
            max = Math.max(result[i], max);
        }
        return max;
    }
}


