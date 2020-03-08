package com.offer;

/**
 * @Solution: 后面的丑数即为前面的丑数*2，*3，*5
 * @Title: 丑数
 * @Description: 我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 * @Author: chenghao.su
 * @Date: 2020/3/8 14:33
 */
public class _49 {
    public static void main(String[] args) {

    }

    /**
     * 每个丑数都等于前面的丑数*2，*3，*5
     *
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        // p2永远为*2，p3永远为*3，p5永远为*5
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[p2] * 2, Math.min(dp[p3] * 3, dp[p5] * 5));
            if (dp[i] == dp[p2] * 2) {
                p2++;
            }
            if (dp[i] == dp[p3] * 3) {
                p3++;
            }
            if (dp[i] == dp[p5] * 5) {
                p5++;
            }
        }
        return dp[n - 1];
    }
}
