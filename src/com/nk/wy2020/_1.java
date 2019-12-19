package com.nk.wy2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Title: 二进制计数-研发
 * @Description: 给定N个非负整数，将这N个数字按照二进制下1的个数分类，二进制下1的个数相同的数字属于同一类。求最后一共有几类数字
 * @Author: chenghao.su
 * @Date: 2019/12/19 19:23
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int result = 0;
            Map<Integer, Integer> resultMap = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int num = in.nextInt();
                int oneNum = 1;
                int oneSum = 0;
                while (oneNum <= num) {
                    if ((oneNum & num) == oneNum) {
                        oneSum++;
                    }
                    oneNum = oneNum << 1;
                }
                if (resultMap.get(oneSum) == null) {
                    resultMap.put(oneSum, oneSum);
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
