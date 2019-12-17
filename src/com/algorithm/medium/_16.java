package com.algorithm.medium;

import java.util.Arrays;

/**
 * @Title: 最接近的三数之和
 * @Description: 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * @Author: chenghao.su
 * @Date: 2019/12/13 14:44
 */
public class _16 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{0, 2, 1, -3}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int result = Integer.MAX_VALUE;
        int resultSum = Integer.MAX_VALUE;
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int distance = sum - target;
                if (distance > 0) {
                    right--;
                } else if (distance < 0) {
                    left++;
                } else if (distance == 0) {
                    return sum;
                }
                if (Math.abs(distance) < result) {
                    result = Math.abs(distance);
                    resultSum = sum;
                }
            }
        }
        return resultSum;
    }
}
