package com.algorithm.medium;

/**
 * @Solution: 位运算
 * @Title: 数组中数字出现的次数
 * @Description: 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * @Author: chenghao.su
 * @Date: 2020/3/4 11:23
 */
public class _56_I {
    public static void main(String[] args) {

    }

    public int[] singleNumbers(int[] nums) {
        int two = 0;
        // 将所有数进行异或获得两个数的异或值
        for (int num : nums) {
            two = two ^ num;
        }
        // 根据异或值找到值为1的任意位置
        int index = 0;
        while ((two & 1) != 1) {
            two = two >> 1;
            index++;
        }
        // 根据这个位置将数组分为两部分进行异或，让两个不同的值分开
        int key = 1 << index;
        int[] result = new int[]{0, 0};
        for (int num : nums) {
            if ((num & key) == key) {
                result[0] = result[0] ^ num;
            } else {
                result[1] = result[1] ^ num;
            }
        }
        return result;
    }
}
