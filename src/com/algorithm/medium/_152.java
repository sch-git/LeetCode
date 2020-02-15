package com.algorithm.medium;

/**
 * @Description: 乘积最大子序列
 * @Author: chenghao.su
 * @Date: 2020/2/15 22:43
 */
public class _152 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                2, 3, -2, 4, 5
        };
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i] * imax, nums[i]);
            imin = Math.min(nums[i] * imin, nums[i]);
            max = Math.max(max, imax);

        }
        return max;
    }
}
