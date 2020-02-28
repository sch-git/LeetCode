package com.exam.xdwl;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/28 19:33
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String source = in.next();
        String target = in.next();
        int len = source.length();
        String result = "";
        Stack<Character> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < len; i++) {
            char sourch = source.charAt(index);
            char tarch = target.charAt(len - i - 1);
            result = "D" + result;
            if (sourch == tarch) {
                result = "E" + result;
                String temp = "" + sourch;
                while (!stack.isEmpty()) {
                    result = "E" + result;
                    temp += stack.pop();
                }
                if (source.substring(index, index + temp.length()).equals(temp)) {
                    index = i + 1;
                    continue;
                } else {
                    System.out.println(-1);
                    return;
                }
            } else if (sourch != tarch) {
                stack.push(tarch);
            }
        }
        System.out.println(result);
    }
}
