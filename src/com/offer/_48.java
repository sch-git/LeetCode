package com.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Solution: HashMap 滑动窗口
 * @Title: 最长不含重复字符的子字符串
 * @Description: 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * @Author: chenghao.su
 * @Date: 2020/3/30 15:45
 */
public class _48 {
    public static void main(String[] args) {

    }

    /**
     * 使用 HashMap 进行判断是否重复，将重复元素之前的元素移除，重新计算长度
     *
     * @param s 字符串
     * @return 最长不含重复字符的子字符串
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) {
            return 0;
        }
        int max = 1;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == null) {
                max = Math.max(max, i - start + 1);
            } else {
                for (int j = start; j < map.get(ch); j++) {
                    map.remove(s.charAt(j));
                }
                start = map.get(ch) + 1;
            }
            map.put(ch, i);
        }
        return max;
    }
}
