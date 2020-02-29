package com.nk.tx2020;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Title: 压缩算法
 * @Description: 对于字符串中连续的m个相同字符串S将会压缩为[m|S](m为一个整数且1<=m<=100)，例如字符串ABCABCABC将会被压缩为[3|ABC]
 * @Author: chenghao.su
 * @Date: 2020/1/13 21:42
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Integer> stack = new Stack<>();
        Stack<String> stackStr = new Stack<>();
        String result = "";
        int nowNum = 0;
        boolean flag = false;
        String re = "";
        for (int i = 0; i < str.length(); i++) {
            char nowCh = str.charAt(i);
            if (nowCh == '|') {
                flag = true;
                stack.push(nowNum);
                nowNum = 0;
                continue;
            }
            if (nowCh - '0' >= 1 && nowCh - '0' <= 9) {
                nowNum = nowNum * 10 + nowCh;
                continue;
            }
            if (nowCh == ']' || nowCh == '[' && result.length() > 0) {
                stackStr.push(result);
                result = "";
                flag = false;
            }
            if (nowCh == '[') {
                continue;
            }
            if (nowCh == ']') {
                int num = stack.pop();
                String s = stackStr.pop();
                for (int j = 0; j < num; j++) {
                    if (stack.isEmpty()) {
                        re += result;
                    } else {
                        result += s;
                    }
                }
                if (!stack.isEmpty()) {
                    re += result;
                }
                continue;
            }
            if (flag) {
                result += nowCh;
            }
            re += nowCh;
        }
        System.out.println(re);
    }
}
