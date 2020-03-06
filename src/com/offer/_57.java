package com.offer;

/**
 * @Solution: 双指针
 * @Title: 和为s的两个数字
 * @Description: 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * @Author: chenghao.su
 * @Date: 2020/3/6 20:50
 */
public class _57 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                return new int[]{nums[left], nums[right]};
            }
        }
        return null;
    }
}
