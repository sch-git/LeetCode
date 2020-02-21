package com.offer;

/**
 * @Title: 左旋转字符串
 * @Description: 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * @Author: chenghao.su
 * @Date: 2020/2/21 19:53
 */
public class _58 {
    public static void main(String[] args) {

    }

    public String reverseLeftWords(String s, int n) {
        String begin = s.substring(n);
        String end = s.substring(0, n);
        return begin + end;
    }
}
