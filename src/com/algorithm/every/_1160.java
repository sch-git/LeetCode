package com.algorithm.every;

import java.util.Arrays;

/**
 * @Solution: 循环遍历
 * @Title: 拼写单词
 * @Description: 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 * @Author: chenghao.su
 * @Date: 2020/3/17 19:33
 */
public class _1160 {
    public static void main(String[] args) {

    }

    public int countCharacters(String[] words, String chars) {
        int[] nums = new int[chars.length()];
        for (int i = 0; i < chars.length(); i++) {
            nums['a' - chars.charAt(i)]++;
        }
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            int[] temp = Arrays.copyOf(nums, nums.length);
            int tempSum = 0;
            for (int j = 0; j < words[i].length(); j++) {
                temp['a' - words[i].charAt(j)]--;
                if (temp['a' - words[i].charAt(j)] < 0) {
                    flag = false;
                    break;
                }
                tempSum++;
            }
            if (flag) {
                sum += tempSum;
            }
        }
        return sum;
    }
}
