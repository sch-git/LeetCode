package com.algorithm.simple;

import java.util.Stack;


/**
 * @Title: 回文数
 * @Description: 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * @Author: chenghao.su
 * @Date: 2019/12/11 16:09
 */
public class _9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome_2(-1));
    }

    /**
     * 普通解法：将整数转化为字符串
     *
     * @param x 输入整数
     * @return 是否回文
     */
    public static boolean isPalindrome(int x) {
        char[] num = Integer.toString(x).toCharArray();
        for (int i = 0; i < num.length / 2; i++) {
            if (num[i] != num[num.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome_2(int x) {
        Stack<Integer> numList = new Stack<>();
        int num = x;
        while (num != 0) {
            int nowNum = num % 10;
            num = num / 10;
            numList.push(nowNum);
        }
        if (x < 0) {
            return false;
        }
        num = x;
        while (num != 0) {
            int nowNum = num % 10;
            num = num / 10;
            if (nowNum != numList.pop()) {
                return false;
            }
        }
        return true;
    }
}
