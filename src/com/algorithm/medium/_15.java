package com.algorithm.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Title: 三数之和
 * @Description: 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * @Author: chenghao.su
 * @Date: 2019/12/13 13:25
 */
public class _15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{1, -1, -1, 0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3) {
            return result;
        }
        for (int i = (len - 2) / 2; i >= 0; i--) {
            downAdjust(nums, i, len);
        }
        for (int i = len - 1; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            downAdjust(nums, 0, i);
        }

        if (nums[0] > 0) {
            return result;
        }
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    right--;
                    left++;
                }

            }
        }
        return result;
    }

    /**
     * 堆排序下沉调整
     *
     * @param arr         待调整的堆
     * @param parentIndex 要下沉的父节点
     * @param len         堆的有效大小
     */
    public static void downAdjust(int[] arr, int parentIndex, int len) {
        int temp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < len) {
            // 找到值最大的孩子
            if (childIndex + 1 < len && arr[childIndex] < arr[childIndex + 1]) {
                childIndex++;
            }
            if (temp > arr[childIndex]) {
                break;
            }
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = childIndex * 2 + 1;
        }
        arr[parentIndex] = temp;
    }
}
