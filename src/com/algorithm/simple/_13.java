package com.algorithm.simple;

import java.util.HashMap;
import java.util.Map;

;

/**
 * @Title: 罗马数字转整数
 * @Description: _12 整数转罗马数字
 * @Author: chenghao.su
 * @Date: 2019/12/12 22:13
 */
public class _13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> mapper = new HashMap<>();
        mapper.put('I', 1);
        mapper.put('V', 5);
        mapper.put('X', 10);
        mapper.put('L', 50);
        mapper.put('C', 100);
        mapper.put('D', 500);
        mapper.put('M', 1000);
        int nowNum = 0;
        int result = 0;
        int frontNum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i < s.length() - 1) {
                frontNum = mapper.get(s.charAt(i + 1));
            }
            nowNum = mapper.get(s.charAt(i));
            if (nowNum < frontNum) {
                result -= nowNum;
            } else {
                result += nowNum;
            }
        }
        return result;
    }
}
