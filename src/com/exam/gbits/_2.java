package com.exam.gbits;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/14 16:59
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 1;
        int ac = n / 2;
        for (int i = 1; i <= n; i++) {
            res = res * 2;
            res = res % 1000000007;
        }
        int temp = res;
        for (int i = 0; i < ac; i++) {
            res += temp;
            res = res % 1000000007;
        }
        System.out.println(res);
    }

}
