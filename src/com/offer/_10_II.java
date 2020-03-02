package com.offer;

/**
 * @Solution: 大数越界： 随着 nn 增大, f(n)f(n) 会超过 Int32 甚至 Int64 的取值范围，导致最终的返回值错误。
 * @Title: 青蛙跳台阶问题
 * @Description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * @Author: chenghao.su
 * @Date: 2020/3/2 20:51
 */
public class _10_II {
    public static void main(String[] args) {

    }

    public static int numWays(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = (result[i - 2] + result[i - 1]) % 1000000007;
        }
        return result[n];
    }
}
