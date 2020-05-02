package com.algorithm.every;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: 无重复字符的最长子串
 * @Description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @Author: chenghao.su
 * @Date: 2020/5/2 17:07
 */
public class _3 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) != null) {
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i);
            end++;
            max = Math.max(max, end - start);
        }
        return max;
    }
}
