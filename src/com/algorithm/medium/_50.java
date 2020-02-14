package com.algorithm.medium;

/**
 * @Title: Pow(x, n)
 * @Description: 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * @Author: chenghao.su
 * @Date: 2020/2/14 21:59
 */
public class _50 {
    public static void main(String[] args) {
    }

    public static double myPow(double x, int n) {
        /**
         * 如果n是int类型的最小负数-2147483648;在执行n=-n时就会发生正数溢出,又会变成负数
         */
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        double result = 1;
        double temp = x;
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result = result * temp;
            }
            temp = temp * temp;
        }
        return result;
    }
}
