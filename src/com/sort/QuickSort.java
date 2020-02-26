package com.sort;

import java.util.Arrays;

/**
 * @Description: 快速排序
 * @Author: chenghao.su
 * @Date: 2020/2/26 19:32
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 1, 5, 6, 7, 8, 30, 50, 1, 33, 24, 5, -4, 7, 0};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        /**
         * 根据pivot的位置，将数组分为两部分
         */
        int pivotIndex = part(arr, left, right);
        quick(arr, left, pivotIndex - 1);
        quick(arr, pivotIndex + 1, right);
    }

    /**
     * 返回基准元素的位置
     *
     * @param arr
     * @param left  左指针
     * @param right 右指针
     * @return 基准元素的位置
     */
    public static int part(int[] arr, int left, int right) {
        int pivot = arr[left];
        int start = left;
        int end = right;
        /**
         * 左指针找到比pivot大的值，右指针找到比pivot小的值
         * left<right则进行交换
         * 结束循环之后将pivot与左右指针重合点交换，返回index
         */
        while (start < end) {
            while (arr[end] > pivot && end > start) {
                end--;
            }
            while (arr[start] <= pivot && start < end) {
                start++;
            }
            if (start < end) {
                int p = arr[start];
                arr[start] = arr[end];
                arr[end] = p;
            }
        }
        int temp = arr[start];
        arr[start] = pivot;
        arr[left] = temp;
        return start;
    }
}
