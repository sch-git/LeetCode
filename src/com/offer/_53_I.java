package com.offer;

/**
 * @Solution: 分治-二分查找
 * @Title: 在排序数组中查找数字 I
 * @Description: 统计一个数字在排序数组中出现的次数。
 * @Author: chenghao.su
 * @Date: 2020/2/29 09:40
 */
public class _53_I {
    public static void main(String[] args) {
        int[] nums = new int[]{
                1, 2, 3, 3, 3, 3, 4, 5, 9
        };
        search(nums, 3);
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        int sum = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        if (index != -1) {
            ++sum;
            for (int i = index; i > 0; i--) {
                if (nums[i - 1] == nums[index]) {
                    sum++;
                }
            }
            for (int j = index + 1; j < nums.length; j++) {
                if (nums[j] == nums[index]) {
                    sum++;
                }
            }
        }
        return sum;
    }

}
