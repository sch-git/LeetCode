package com.algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 括号生成
 * @Description: 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * @Author: chenghao.su
 * @Date: 2020/2/11 20:13
 */
public class _22 {
    List<String> result = new ArrayList<>();

    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {

        int left = 0;
        int right = 0;
        dfs("", left, right, n);
        return result;
    }

    /**
     * @param string 结果
     * @param left   左边括号数量
     * @param right  右边括号数量
     * @param n      括号数量
     */
    public String dfs(String string, int left, int right, int n) {
        if (left == n && right == n) {
            return string;
        }
        if (left < right) {
            return null;
        }
        if (left < n) {
            String temp = dfs(string + "(", left + 1, right, n);
            if (temp != null) {
                result.add(temp);
            }
        }
        if (right < n) {
            String temp = dfs(string + ")", left, right + 1, n);
            if (temp != null) {
                result.add(temp);
            }
        }
        return null;
    }
}
