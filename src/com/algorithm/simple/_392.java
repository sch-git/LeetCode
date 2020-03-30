package com.algorithm.simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Solution: 队列 动态规划
 * @Title: 判断子序列
 * @Description: 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/30 16:34
 */
public class _392 {
    public static void main(String[] args) {

    }

    // 动态规划
    public static boolean isSubsequence2(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen > tLen) {
            return false;
        }
        if (sLen == 0) {
            return true;
        }
        boolean[][] dp = new boolean[sLen + 1][tLen + 1];
        //初始化
        for (int j = 0; j < tLen; j++) {
            dp[0][j] = true;
        }
        //dp
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= tLen; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[sLen][tLen];
    }

    public boolean isSubsequence(String s, String t) {
        Queue<Character> queue = new LinkedList<>();
        if (s.length() < 1) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (queue.peek() == t.charAt(i)) {
                queue.remove();
            }
            if (queue.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}