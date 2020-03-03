package com.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Solution: Map
 * @Title: 第一个只出现一次的字符
 * @Description: 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 * @Author: chenghao.su
 * @Date: 2020/3/3 13:08
 */
public class _50 {
    public static void main(String[] args) {

    }

    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return ' ';
    }
}
