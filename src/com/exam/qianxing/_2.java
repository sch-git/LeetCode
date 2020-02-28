package com.exam.qianxing;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/28 18:17
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int num = 1;
        int rabbit = 1;
        int[] result = new int[month];
        for (int i = 0; i < 4; i++) {
            result[i] = 1;
        }
        for (int i = 4; i < month; i++) {
            result[i] = result[i - 1] + result[i - 4];
        }
        System.out.println(result[month - 1]);
    }
}
