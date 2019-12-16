package com.algorithm.simple;

;

/**
 * @Title: 爬楼梯
 * @Description: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * @Author: chenghao.su
 * @Date: 2019/12/16 21:48
 */
public class _70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }

    public static int climbStairs(int n) {
        int[] result = new int[n + 1];
        if (n <= 2) {
            return n;
        }
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}
