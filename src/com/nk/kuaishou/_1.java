package com.nk.kuaishou;

import java.util.Scanner;

/**
 * @Title: 最少数量货物装箱问题
 * @Description: 有重量分别为3，5，7公斤的三种货物，和一个载重量为X公斤的箱子（不考虑体积等其它因素，只计算重量）
 * 需要向箱子内装满X公斤的货物，要求使用的货物个数尽可能少（三种货物数量无限）
 * @Author: chenghao.su
 * @Date: 2020/2/24 09:34
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pro = new int[]{3, 5, 7};
        int weight = in.nextInt();
        if (weight < 3) {
            System.out.println(-1);
            return;
        }
        int[] result = new int[weight + 1];
        result[1] = Integer.MIN_VALUE;
        result[2] = Integer.MIN_VALUE;
        for (int i = 3; i <= weight; i++) {
            result[i] = Integer.MAX_VALUE;
            for (int j = 0; j < pro.length; j++) {
                if (i - pro[j] >= 0 && result[i - pro[j]] >= 0 && result[i - pro[j]] != Integer.MAX_VALUE) {
                    result[i] = Math.min(result[i], result[i - pro[j]] + 1);
                }
            }
        }
        System.out.println(result[weight] == Integer.MAX_VALUE ? -1 : result[weight]);
    }

}
