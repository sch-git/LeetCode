package com.exam.crazy;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/22 10:01
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Long> stack = new Stack<>();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '*') {
                buffer.append(ch);
            } else {
                stack.push(Long.parseLong(buffer.toString()));
                buffer = new StringBuffer();
            }
        }
        if (buffer.length() > 0) {
            stack.push(Long.parseLong(buffer.toString()));
        }
        long mul = 1;
        while (!stack.isEmpty()) {
            mul *= stack.pop();
            mul = mul % Long.MAX_VALUE;
        }
        System.out.println(mul);
    }
}
