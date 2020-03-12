package com.exam.sugame;

import java.util.Random;

/**
 * @Title: 广州速游笔试
 * @Description: 乱序输出数组
 * @Author: chenghao.su
 * @Date: 2020/3/12 16:09
 */
public class _1 {
    public static void main(String[] args) {
        int[] L = new int[]{
                1, 6, 9, 8, 5, 3, 4, 6, 10
        };
        int[] re = sort(L);
        for (int i : re) {
            System.out.println(i);
        }
    }

    /**
     * 从0-数组长度中随机一个数，将这个数复制给新数组，将原数组最后一个数赋值给这个数，原数组长度减一；
     *
     * @param L 数组
     * @return 乱序数组
     */
    public static int[] sort(int[] L) {
        int[] arr = new int[L.length];
        int count = arr.length;
        int position = 0; // 位置
        for (int i = 0; i < count; ) {
            Random random = new Random();
            int index = random.nextInt(count);
            arr[position++] = L[index];
            L[index] = L[--count];
        }
        return arr;
    }
}
