package com.sort;

import java.util.Arrays;

/**
 * @Description: 选择排序-不稳定
 * @Author: chenghao.su
 * @Date: 2020/2/25 19:01
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 1, 5, 6, 7, 8, 30, 50, 1, 33, 24, 5, -4, 7, 0};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param list 待排序数组
     */
    public static void select(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < list.length; j++) {
                if (list[j] > max) {
                    max = list[j];
                    list[j] = list[i];
                    list[i] = max;
                }
            }
        }
    }

}
