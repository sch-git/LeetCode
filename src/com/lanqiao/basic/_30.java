package com.lanqiao.basic;

import java.util.Scanner;

/**
 * @Title: 阶乘计算
 * @Description: 　　输入一个正整数n，输出n!的值。　　其中n!=1*2*3*…*n。
 * n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。
 * 　　输入包含一个正整数n，n<=1000。
 * @Author: chenghao.su
 * @Date: 2020/4/16 21:07
 */
public class _30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n + 1];

        System.out.println(f(n, strings));
    }

    public static String f(int n, String[] strings) {
        if (strings[n] != null) {
            return strings[n];
        }
        if (n == 1) {
            strings[1] = String.valueOf(n);
            return strings[n];
        }
        strings[n] = mul(String.valueOf(n), f(n - 1, strings));
        return strings[n];
    }

    public static String mul(String source, String m) {
        Integer num = Integer.parseInt(source);
        int j = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = m.length() - 1; i >= 0; i--) {
            int temp = m.charAt(i) - '0';
            int sum = temp * num + j;
            if (sum >= 10) {
                j = sum / 10;
                sum = sum % 10;
            } else {
                j = j / 10;
            }
            builder = builder.append(sum);
        }
        if (j != 0) {
            return j + builder.reverse().toString();
        } else {
            return builder.reverse().toString().replaceAll("^(0)+", "");
        }
    }
}
