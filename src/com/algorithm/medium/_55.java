package com.algorithm.medium;

/**
 * @Title: 跳跃游戏
 * @Description: 数组中的每个元素代表你在该位置可以跳跃的最大长度。判断你是否能够到达最后一个位置。
 * @Author: chenghao.su
 * @Date: 2020/1/5 21:59
 */
public class _55 {
    public static void main(String[] args) {
        int[] result = new int[]{
                3, 2, 1, 0, 4
        };
        System.out.println(canJump(result));
    }

    public static boolean canJump(int[] nums) {
        int length = nums.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = false;
        }
        result[length - 1] = true;
        int lastIndex = length - 1;
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] + i >= lastIndex) {
                result[i] = true;
                lastIndex = i;
            }
        }
        return result[0];
    }
}
