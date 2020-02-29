package com.offer;

/**
 * @Solution: 异或/二分查找
 * @Title: 0～n-1中缺失的数字
 * @Description: 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/2/29 10:18
 */
public class _53_II {
    public static void main(String[] args) {
        int[] nums = new int[]{
                0, 1, 3
        };
        missingNumber(nums);
    }

    // 异或
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i] ^ i;
        }
        sum = sum ^ nums.length;
        return sum;
    }

    // 二分查找 TODO
}
