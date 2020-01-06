package com.algorithm.simple;

/**
 * @Title: 最后一个单词的长度
 * @Description: 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * @Author: chenghao.su
 * @Date: 2020/1/6 22:19
 */
public class _58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }

    public static int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        if (result.length <= 0) {
            return 0;
        }
        return result[result.length - 1].length();
    }
}
