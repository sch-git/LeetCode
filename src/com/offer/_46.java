package com.offer;

/**
 * @Solution: 递归/循环
 * @Title: 把数字翻译成字符串
 * @Description: 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/17 17:55
 */
public class _46 {
    public static void main(String[] args) {

    }

    public int translateNum(int num) {
        String nums = String.valueOf(num);
        int[] dp = new int[nums.length()];
        dp[0] = 1;
        for (int i = 1; i < nums.length(); i++) {
            char ch1 = nums.charAt(i - 1);
            char ch2 = nums.charAt(i);
            int temp = Integer.parseInt((ch1 + ch2 + ""));
            if (ch1 == '0') {
                dp[i] = dp[i - 1];
                continue;
            }
            if (temp <= 25) {
                dp[i] += dp[i - 1];
                if (i > 1 && dp[i - 2] > 0) {
                    dp[i] += dp[i - 2];
                }
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[nums.length() - 1];
    }
}
