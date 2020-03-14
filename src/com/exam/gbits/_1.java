package com.exam.gbits;

import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/14 16:46
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] chList = new int[26];
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char old = ch;
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            if (chList[ch - 97] == 0) {
                chList[ch - 97] = 1;
                buffer.append(old);
            }
        }
        System.out.println(buffer.toString());
    }
}
