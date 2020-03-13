package com.offer;

/**
 * @Solution: 遍历+条件判断
 * @Title: 机器人的运动范围
 * @Description: 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/13 14:26
 */
public class _13 {
    public static void main(String[] args) {

    }

    public int movingCount(int m, int n, int k) {
        int[][] dp = new int[m][n];
        int sum = 1;
        for (int i = 1; i < n; i++) {
            if (isOk(0, i, k) && dp[0][i - 1] == 1) {
                dp[0][i] = 1;
                sum++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (isOk(i, 0, k) && dp[i - 1][0] == 1) {
                dp[i][0] = 1;
                sum++;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (isOk(i, j, k)) {
                    if (dp[i][j - 1] == 1 || dp[i - 1][j] == 1) {
                        dp[i][j] = 1;
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    public boolean isOk(int m, int n, int k) {
        int sum = 0;
        while (m > 0) {
            sum += m % 10;
            m = m / 10;
        }
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum <= k;
    }
}
