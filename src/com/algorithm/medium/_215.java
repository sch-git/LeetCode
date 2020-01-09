package com.algorithm.medium;

import java.util.Arrays;

/**
 * @Title: 数组中的第K个最大元素
 * @Description: 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * @Author: chenghao.su
 * @Date: 2020/1/9 20:51
 */
public class _215 {
    public static void main(String[] args) {
        int[] result = new int[]{
                3, 2, 3, 1, 2, 4, 5, 5, 6
        };
        int k = 4;
        System.out.println(findKthLargest(result, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        k--;
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--, k--) {
            if (k == 0) {
                return nums[i];
            }
        }
        return nums[len - 1];
    }

}