package com.sort;

import java.util.Arrays;

/**
 * @Title: 冒泡排序
 * @Description: 时间复杂度O(n ^ 2)/稳定排序
 * @Author: chenghao.su
 * @Date: 2020/2/22 20:23
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 1, 5, 6, 7, 8};
        bubble_area(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 普通版
     */
    public static void bubble(int[] list) {
        int len = list.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 加入有序标记,判断循环是否有进行交换,若没有则有序
     */
    public static void bubble_flag(int[] list) {
        int len = list.length;
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 0; j < len - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                return;
            }
        }
    }

    /**
     * 记录有序区的位置（即最后一次交换元素的位置）
     *
     * @param list 待排序数组
     */
    public static void bubble_area(int[] list) {
        int len = list.length;
        int areaLen = len;
        for (int i = 0; i < list.length; i++) {
            boolean flag = true;
            for (int j = 0; j < len - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = false;
                    areaLen = j + 1;
                }
            }
            len = areaLen;
            if (flag) {
                return;
            }
        }
    }
}
