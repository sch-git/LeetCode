package com.lanqiao.basic;

import java.util.Scanner;

/**
 * @Title: 高精度加法
 * @Description: 输入两个整数a和b，输出这两个整数的和。a和b都不超过100位。
 * @Author: chenghao.su
 * @Date: 2020/4/16 21:41
 */
public class _29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder chars1 = new StringBuilder(in.nextLine());
        StringBuilder chars2 = new StringBuilder(in.nextLine());
        char[] charset1 = chars1.reverse().toString().toCharArray();
        char[] charset2 = chars2.reverse().toString().toCharArray();
        StringBuilder builder = new StringBuilder();
        int c = 0;
        for (int i = 0; i < Math.min(charset1.length, charset2.length); i++) {
            int sum = (charset1[i] - '0') + (charset2[i] - '0') + c;
            c = sum / 10;
            builder.append(sum % 10);
        }
        if (charset1.length < charset2.length) {
            for (int i = charset1.length; i < charset2.length; i++) {
                int sum = charset2[i] - '0' + c;
                builder.append(sum % 10);
                c = sum / 10;
            }
        } else if (charset2.length < charset1.length) {
            for (int i = charset2.length; i < charset1.length; i++) {
                int sum = charset1[i] - '0' + c;
                builder.append(sum % 10);
                c = sum / 10;
            }
        }
        builder.append(c);
        String result = builder.reverse().toString().replaceAll("^(0)+", "");
        System.out.println(result.length() > 0 ? result : 0);
    }
}
