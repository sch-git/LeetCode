package com.nk.wy2020;

import java.util.Scanner;

/**
 * @Title: 水平线-研发
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2019/12/19 19:47
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] stations = new int[n];
        for (int i = 0; i < n; i++) {
            stations[i] = in.nextInt();
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int height = in.nextInt();
            int result = 0;
            for (int j = 0; j < n; j++) {
                if (stations[j] > height) {
                    if (j == 0 || stations[j - 1] <= height) {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
