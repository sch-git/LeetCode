package com.exam;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/27 20:03
 */
public class _3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[][][] result = new int[n][n][2];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

    }
}
