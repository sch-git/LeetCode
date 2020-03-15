package com.exam.bytes;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/15 19:07
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D, W;
        D = in.nextInt();
        W = in.nextInt();

        char[] positions = in.next().toCharArray();
        char[] supply = in.next().toCharArray();
        int[] dp = new int[D];
        int max = 0;
        for (int i = 0; i < D; i++) {
            dp[i] = W + (supply[i] - 0) - (positions[i] - 0);
            int distance = D - (positions[i] - 0);
        }
    }

}
