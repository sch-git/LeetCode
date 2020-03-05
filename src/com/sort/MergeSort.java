package com.sort;

/**
 * @Description: 归并排序
 * @Author: chenghao.su
 * @Date: 2020/3/5 10:11
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 66, 3, 7, 9};
        sort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            // 折半成两个小集合，分别进行递归
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            // 合并两个有序小集合
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int a = start;
        int b = mid + 1;
        int index = 0;
        while (a < mid + 1 && b <= end) {
            if (arr[a] < arr[b]) {
                temp[index++] = arr[a++];
            } else if (arr[a] >= arr[b]) {
                temp[index++] = arr[b++];
            }
        }
        while (a < mid + 1) {
            temp[index++] = arr[a++];
        }
        while (b <= end) {
            temp[index++] = arr[b++];
        }
        for (int i = 0; i < index; i++) {
            arr[i + start] = temp[i];
        }
    }

}
