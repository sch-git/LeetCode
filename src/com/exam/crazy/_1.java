package com.exam.crazy;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Solution: BigInteger大整数
 * @Description:
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
        // 将数据转为大整数防止溢出
        BigInteger mul = BigInteger.valueOf(1L);
        while (!stack.isEmpty()) {
            mul = mul.multiply(BigInteger.valueOf(stack.pop()));
        }
        System.out.println(mul.toString());
    }
}
