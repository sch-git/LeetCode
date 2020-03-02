package com.offer;

/**
 * @Solution: 快速幂
 * @Title: 数值的整数次方
 * @Description: 实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/2 21:22
 */
public class _16 {
    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        // 将n赋值给long类型，防止-n为Integer.MIN_VALUE转为正数时越界
        long temp = n;
        if (n < 0) {
            temp = -temp;
            x = 1 / x;
        }

        double result = 1.0;
        while (temp > 0) {
            if ((temp & 1) == 1) {
                result *= x;
            }
            x = x * x;
            temp = temp >> 1;
        }
        return result;
    }
}
