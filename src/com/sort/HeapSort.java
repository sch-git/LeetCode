package com.sort;

import java.util.Arrays;

/**
 * @Description: 堆排序
 * @Author: chenghao.su
 * @Date: 2020/3/17 22:48
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{
                6, 3, 8, 5, 2, -1, -5, -2, -6, 345, 5, 1, 2, 23, 4235, 6, 87, 48
        };
        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void HeapSort(int[] arr) {
        maxHeap(arr, arr.length - 1);
        int size = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[0];
            arr[0] = arr[size];
            arr[size] = temp;
            heap(arr, 0, size);
            size--;
        }
    }

    // 第一次建堆
    public static void maxHeap(int[] arr, int size) {
        for (int i = size - 1; i >= 0; i--) {
            heap(arr, i, size);
        }
    }

    /**
     * 建堆
     *
     * @param arr         看成完全二叉树
     * @param currentRoot 当前父节点位置
     * @param size        结点总数
     */
    public static void heap(int[] arr, int currentRoot, int size) {
        if (currentRoot < size) {
            int left = 2 * currentRoot + 1;
            int right = 2 * currentRoot + 2;

            // 设置当前元素为最大值
            int max = currentRoot;

            if (left < size) {
                // 判断左结点是否比最大元素大
                if (arr[left] > arr[max]) {
                    max = left;
                }
            }
            if (right < size) {
                // 判断右结点是否比最大元素大
                if (arr[right] > arr[max]) {
                    max = right;
                }
            }
            // 如果最大的不是根元素
            if (max != currentRoot) {
                int temp = arr[max];
                arr[max] = arr[currentRoot];
                arr[currentRoot] = temp;
                // 继续比较
                heap(arr, max, size);
            }
        }
    }
}
