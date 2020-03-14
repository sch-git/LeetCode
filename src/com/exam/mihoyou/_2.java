package com.exam.mihoyou;

import java.util.Stack;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/13 18:53
 */
public class _2 {
    public static void main(String[] args) {

    }

    public String minRemove(String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        int leftNum = 0;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '(' && ch != ')') {
                stack.push(ch);
            } else if (ch == '(') {
                stack.push(ch);
                leftNum++;
            } else if (ch == ')' && leftNum > 0) {
                stack.push(')');
                leftNum--;
            }
        }
        while (!stack.isEmpty()) {
            if (leftNum > 0 && stack.peek() == '(') {
                stack.pop();
                leftNum--;
            } else {
                result.append(stack.pop());
            }
        }
        return result.reverse().toString();
    }
}
