package com.exam.xdwl;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/28 20:04
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][10001];
        int[] arrL = new int[n];
        for (int i = 0; i < n; i++) {
            arrL[i] = in.nextInt();
            for (int k = 0; k < arrL[i]; k++) {
                arr[i][k] = in.nextInt();
            }
            Arrays.sort(arr[i]);
        }

    }
}
