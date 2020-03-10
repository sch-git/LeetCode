package com.exam.feiyu;

import java.util.Scanner;

/**
 * @Description: 字符串反转
 * @Author: chenghao.su
 * @Date: 2020/3/9 19:47
 */
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = " " + in.nextLine();
        StringBuffer buffer = new StringBuffer();
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                buffer = buffer.append(" ");
                result += buffer;
                buffer = new StringBuffer();
                continue;
            } else {
                buffer = buffer.append(ch);
            }
        }
        s = "";
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            if (ch == ' ') {
                buffer = buffer.append(" ");
                s += buffer.reverse();
                buffer = new StringBuffer();
                continue;
            } else {
                buffer = buffer.append(ch);
            }
        }
        System.out.println(s.trim());
    }
}
