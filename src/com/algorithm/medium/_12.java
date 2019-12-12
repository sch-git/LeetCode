package com.algorithm.medium;

;

/**
 * @Title: 整数转罗马数字
 * @Description: 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * @Author: chenghao.su
 * @Date: 2019/12/12 20:46
 */
public class _12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }

    /**
     * 贪心
     *
     * @param num 数字
     * @return 罗马数字
     */
    public static String intToRoman(int num) {
        StringBuffer result = new StringBuffer();
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        while (num > 0) {
            while (num >= nums[index]) {
                result.append(roman[index]);
                num -= nums[index];
            }
            index++;
        }
        return result.toString();
    }
}
