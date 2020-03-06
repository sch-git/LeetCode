package com.offer;

/**
 * @Solution: 双指针，注意边界
 * @Title: 调整数组顺序使奇数位于偶数前面
 * @Description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * @Author: chenghao.su
 * @Date: 2020/3/6 23:19
 */
public class _21 {
    public static void main(String[] args) {

    }

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            while (nums[left] % 2 != 0 && left < right) {
                left++;
            }
            while (nums[right] % 2 == 0 && left < right) {
                right--;
            }
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
        return nums;
    }
}
