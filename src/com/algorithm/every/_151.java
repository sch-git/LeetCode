package com.algorithm.every;

/**
 * @Solution:
 * @Title: 翻转字符串里的单词
 * @Description: 给定一个字符串，逐个翻转字符串中的每个单词。
 * @Author: chenghao.su
 * @Date: 2020/4/10 19:05
 */
public class _151 {
    public static void main(String[] args) {
    }

    public String reverseWords(String s) {
        StringBuffer buf = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                buf.append(ch);
            } else if (buf.length() > 0) {
                result = buf.append(" ").append(result);
                buf = new StringBuffer();
            }
        }
        if (buf.length() > 0) {
            result = buf.append(" ").append(result);
        }
        return result.reverse().toString().trim();
    }
}
