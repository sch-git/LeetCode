package com.exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/27 19:50
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int left = 0;
        int right = 3 * n - 1;
        int sum = 0;
        while (left < right) {
            sum += a[right - 1];
            right -= 2;
            left += 1;
        }
        System.out.println(sum);
    }
}
