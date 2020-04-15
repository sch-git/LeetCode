package com.lanqiao.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Solution: 先将十六进制数转换成二进制数，再由二进制数转换成八进制。
 * @Title: 十六进制转八进制
 * @Description: 给定n个十六进制正整数，输出它们对应的八进制数。
 * @Author: chenghao.su
 * @Date: 2020/4/15 20:54
 */
public class _12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            char[] chars = in.nextLine().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= 'A') {
                    builder.append(HexToBin(chars[j] - 'A' + 10));
                } else {
                    builder.append(HexToBin(chars[j] - '0'));
                }
            }
            String binStr = builder.toString();
            arr[i] = BinToHex(binStr);
        }
        for (String num : arr) {
            System.out.println(num);
        }
    }

    public static String HexToBin(int num) {
        StringBuilder builder = new StringBuilder();
        String pattern = "0000";
        DecimalFormat df = new DecimalFormat(pattern);
        do {
            builder.append(num % 2);
            num /= 2;
        } while (num > 0);
        return df.format(Integer.parseInt(builder.reverse().toString()));
    }

    public static String BinToHex(String binNum) {
        char[] chars = binNum.toCharArray();
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        int m = 1, i, j;
        for (i = chars.length - 1, j = 0; i >= 0; i--, j %= 3) {
            if (j++ == 0) {
                sum = 0;
                m = 1;
            }
            sum += m * (chars[i] - '0');
            m = m << 1;
            if (j == 3) {
                builder.append(sum);
            }
        }
        if (j != 0) {
            builder.append(sum);
        }
        return builder.reverse().toString().replaceAll("^(0+)", "");
    }
}
