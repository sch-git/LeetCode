package com.offer;

import java.util.Arrays;

/**
 * @Solution: 排序输出
 * @Title: 最小的k个数
 * @Description: 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * @Author: chenghao.su
 * @Date: 2020/3/4 13:13
 */
public class _40 {
    public static void main(String[] args) {

    }

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
