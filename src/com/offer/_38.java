package com.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Solution: 广度搜索
 * @Title: 字符串的排列
 * @Description: 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * @Author: chenghao.su
 * @Date: 2020/3/11 21:42
 */
public class _38 {
    Set<String> strings = new HashSet<>();

    public static void main(String[] args) {

    }

    public String[] permutation(String s) {
        permutation2("", s);
        String[] str = new String[strings.size()];
        int index = 0;
        for (String s1 : strings) {
            str[index++] = s1;
        }
        return str;
    }

    public void permutation2(String head, String oth) {
        if (oth.length() < 1) {
            strings.add(head);
        }
        for (int i = 0; i < oth.length(); i++) {
            char ch = oth.charAt(i);
            String pre = oth.substring(0, i);
            String next = oth.substring(i + 1);
            permutation2(head + ch, pre + next);
        }
    }
}
