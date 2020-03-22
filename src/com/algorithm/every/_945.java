package com.algorithm.every;

import java.util.Arrays;

/**
 * @Title: 使数组唯一的最小增量
 * @Description: 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 * @Author: chenghao.su
 * @Date: 2020/3/22 22:28
 */
public class _945 {
    public static void main(String[] args) {

    }

    public int minIncrementForUnique(int[] A) {
        if (A.length <= 1) {
            return 0;
        }
        Arrays.sort(A);

        int n = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                n += A[i - 1] - A[i] + 1;
                A[i] = A[i - 1] + 1;
            }
        }
        return n;
    }
}
