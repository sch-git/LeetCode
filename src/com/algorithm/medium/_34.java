package com.algorithm.medium;

/**
 * @Title: 在排序数组中查找元素的第一个和最后一个位置
 * @Description: 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * @Author: chenghao.su
 * @Date: 2020/2/12 20:28
 */
public class _34 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                1
        };
    }

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int[] result = new int[]{-1, -1};
        if (nums.length < 1) {
            return result;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                int start = mid;
                int end = mid;
                while (start >= 0 && nums[start] == target) {
                    start--;
                }
                while (end <= len - 1 && nums[end] == target) {
                    end++;
                }
                result[0] = ++start;
                result[1] = --end;
                return result;
            }
        }
        return result;
    }
}
