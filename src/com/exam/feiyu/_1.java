package com.exam.feiyu;

import java.util.Scanner;

/**
 * @Description: 去除重复字母，顺序不变
 * @Author: chenghao.su
 * @Date: 2020/3/9 19:38
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();
        int[] chL = new int[26];
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (chL[ch - 'a'] == 0) {
                chL[ch - 'a'] = 1;
                buffer.append(ch);
            }
        }
        System.out.println(buffer.toString());
    }
}
