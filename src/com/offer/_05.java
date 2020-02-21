package com.offer;

/**
 * @Solution:
 * @Title: 替换空格
 * @Description: 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @Author: chenghao.su
 * @Date: 2020/2/21 20:18
 */
public class _05 {
    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                builder.append("%20");
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
