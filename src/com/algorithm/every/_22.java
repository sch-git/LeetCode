package com.algorithm.every;

import java.util.ArrayList;
import java.util.List;

/**
 * @Solution:
 * @Title: 括号生成
 * @Description: 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * @Author: chenghao.su
 * @Date: 2020/4/9 14:22
 */
public class _22 {
    private static List<String> list;

    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        int left = 0;
        int right = 0;
        dfs("", left, right, n);
        return list;
    }

    public String dfs(String string, int left, int right, int n) {
        if (left < right) {
            return null;
        }
        if (left == n && right == n) {
            list.add(string);
            return null;
        }
        if (left < n) {
            dfs(string + "(", left + 1, right, n);
        }
        if (right < n) {
            dfs(string + ")", left, right + 1, n);
        }
        return null;
    }
}
