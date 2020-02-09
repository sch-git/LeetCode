package com.algorithm.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title: 电话号码的字母组合
 * @Description: 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
 * @Author: chenghao.su
 * @Date: 2020/2/9 16:05
 */
public class _17 {
    List<String> result = new ArrayList<>();
    Map<String, String> mapper = new HashMap<>(8);

    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        mapper.put("2", "abc");
        mapper.put("3", "def");
        mapper.put("4", "ghi");
        mapper.put("5", "jkl");
        mapper.put("6", "mno");
        mapper.put("7", "pqrs");
        mapper.put("8", "tuv");
        mapper.put("9", "wxyz");
        if (digits.length() <= 0) {
            return result;
        }
        backtrack("", digits);
        return result;
    }

    public void backtrack(String nowStr, String nextStr) {
        if (nextStr.length() == 0) {
            result.add(nowStr);
        } else {
            String digit = nextStr.substring(0, 1);
            String ph = mapper.get(digit);
            for (int j = 0; j < ph.length(); j++) {
                String temp = mapper.get(digit).substring(j, j + 1);
                backtrack(nowStr + temp, nextStr.substring(1));
            }
        }
    }
}
