package com.algorithm.simple;

/**
 * @Title: 删除排序数组中的重复项
 * @Description: 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @Author: chenghao.su
 * @Date: 2020/1/9 20:38
 */
public class _26 {
    public static void main(String[] args) {
        int[] result = new int[]{
                0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        };
        System.out.println(removeDuplicates(result));
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int lastIndex = 1;
        int nowNum = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] == nowNum) {
                continue;
            }
            nums[lastIndex] = nums[i];
            nowNum = nums[i];
            lastIndex++;
        }
        return lastIndex--;
    }
}
