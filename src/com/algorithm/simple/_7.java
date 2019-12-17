package com.algorithm.simple;


/**
 * @Title: 整数反转
 * @Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @Author: chenghao.su
 * @Date: 2019/12/8 23:09
 */
public class _7 {
    public static void main(String[] args) {
        System.out.println(reverse(Integer.MIN_VALUE));
    }

    public static int reverse(int x) {
        String num = Integer.toString(x);
        String result = "";
        boolean flag = false;
        if (num.charAt(0) == '-') {
            flag = true;
            num = num.substring(1);
        }
        for (int length = num.length() - 1; length >= 0; length--) {
            result += num.charAt(length);
        }
        if (flag) {
            result = "-" + result;
        }
        try {
            return Integer.parseInt(result);
        } catch (Exception ex) {
            return 0;
        }

    }
}
