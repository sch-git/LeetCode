package com.exam.nk2020;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/27 19:26
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 2) {
            System.out.println(1);
            return;
        }
        boolean flag = false;
        int[] a = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (flag) {
                flag = false;
                continue;
            }
            if (i >= 2) {
                if (a[i - 1] > a[i] && a[i - 1] > a[i - 2]) {
                    result++;
                    flag = true;
                } else if (a[i - 1] < a[i] && a[i - 1] < a[i - 2]) {
                    result++;
                    flag = true;
                }
            }
        }
        System.out.println(result + 1);
    }

}
