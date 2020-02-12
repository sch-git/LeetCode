package com.algorithm.medium;

/**
 * @Title: 搜索旋转排序数组
 * @Description: 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * @Author: chenghao.su
 * @Date: 2020/2/12 21:05
 */
public class _33 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                5, 1, 3
        };
        search(nums, 3);
    }

    public static int search(int[] nums, int target) {
        int result = -1;
        int len = nums.length;
        if (len < 1) {
            return result;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return result;
    }
}
