package com.exam.wyhy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/4/11 20:22
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] W = new int[N];
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            T[i] = in.nextInt();
        }
        int M = in.nextInt();
        Arrays.sort(W);
        Arrays.sort(T);
        int sum = 1;
        int si = 0;
        int[] sn = new int[N];
        for (int wi = 0, ti = 0; ti < N; ti++) {
            if (W[si] >= T[ti]) {
                sn[si]++;
            } else {
                si++;
                sn[si] = sn[si - 1];
            }
        }
        for (si += 1; si < N; si++) {
            sn[si] = sn[si - 1];
        }

        for (int i = 0; i < N; i++) {
            sn[i] -= i;
            sn[i] = Math.max(sn[i], 1);
            sum = sum * sn[i];
            sum = sum % M;
        }
        System.out.println(sum % M);
    }
}
