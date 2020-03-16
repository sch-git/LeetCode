package com.offer;

import java.util.Arrays;

/**
 * @Solution: 自定义Comparator实现排序规则
 * @Title: 把数组排成最小的数
 * @Description: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * @Author: chenghao.su
 * @Date: 2020/3/16 13:53
 */
public class _45 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                3, 30, 34, 5, 9
        };
        System.out.println(minNumber(nums));
    }

    public static String minNumber(int[] nums) {
        String[] strList = new String[nums.length];
        int index = 0;
        for (int num : nums) {
            strList[index++] = String.valueOf(num);
        }
        Arrays.sort(strList, (o1, o2) -> {
            return (o1 + o2).compareTo(o2 + o1);
        });
        StringBuffer buffer = new StringBuffer();
        for (String str : strList) {
            buffer.append(str);
        }
        return buffer.toString();
    }
}
