package com.sort;

import java.util.Arrays;

/**
 * @Description: 希尔排序
 * @Author: chenghao.su
 * @Date: 2020/4/7 13:47
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        shell(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shell(int[] arr) {
        // 外层循环控制增量
        for (int incre = arr.length / 2; incre > 0; incre /= 2) {
            for (int j = incre; j < arr.length; j++) {
                int index = j - incre;
                int target = arr[j];
                while (index > -1 && arr[index] > target) {
                    arr[index + incre] = arr[index];
                    index -= incre;
                }
                arr[index + incre] = target;
            }
        }
    }
}
