package com.exam.feiyu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: 跳跃游戏
 * @Author: chenghao.su
 * @Date: 2020/3/9 20:01
 */
public class _3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        boolean[] result = new boolean[N];
        in.nextLine();
        for (int n = 0; n < N; n++) {
            String s = in.nextLine();
            List<Integer> list = new ArrayList<>();
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) != ' ') {
                    list.add((s.charAt(k) - '0'));
                }
            }
            int max = list.get(0);
            for (int i = 1; i < list.size() - 1; i++) {
                max = Math.max(list.get(i) + i, max);
                if (max >= list.size() - 1) {
                    result[n] = true;
                    break;
                }
            }
        }
        for (boolean flag : result) {
            System.out.println(flag);
        }
    }
}
