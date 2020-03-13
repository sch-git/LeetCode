package com.exam.meitu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description: 给出一个序列包含n个正整数的序列A，然后给出一个正整数x，你可以对序列进行任意次操作的，每次操作你可以选择序列中的一个数字，让其与x做按位或运算。你的目的是让这个序列中的众数出现的次数最多。
 * <p>
 * 请问众数最多出现多少次。
 * @Author: chenghao.su
 * @Date: 2020/3/12 19:50
 */
public class _22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        int maxNum = 1;
        int maxValue = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (map.get(arr[i]) != null) {
                map.put(arr[i], map.get(arr[i]) + 1);
                if (map.get(arr[i]) > maxValue) {
                    maxValue = map.get(arr[i]);
                }
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == maxValue) {
                int temp = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        temp++;
                        continue;
                    }
                    if ((arr[j] | x) == arr[i]) {
                        temp++;
                    }
                }
                maxNum = Math.max(temp, maxNum);
            }
        }
        System.out.println(maxNum);
    }
}
