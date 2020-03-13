package com.exam.meitu;

import java.util.Scanner;

/**
 * @Description: 有一个2*n的网格，有一个人位于(1,1)的位置，即左上角，他希望从左上角走到右下角，即(2,n)的位置。在每一次，他可以进行三种操作中的一种：
 * <p>
 * 1． 向右走一格，即从(x,y)到(x,y+1);
 * <p>
 * 2． 向上右方走一格，即，如果他在(2,y)的位置可以走到(1,y+1);
 * <p>
 * 3． 向下右方走一格，即，如果他在(1,y)的位置可以走到(2,y+1);
 * <p>
 * <p>
 * <p>
 * 问题当然不会这么简单，在这2*n的格子中，有一部分格子上有障碍物，他不能停在障碍物上，当然也不能走出网格，请问他有多少种不同的路线可以到达(2,n)。
 * @Author: chenghao.su
 * @Date: 2020/3/12 19:10
 */
public class _111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        System.out.println(n);
        char[][] chars = new char[2][n];
        int[][] dp = new int[2][n];
        for (int k = 0; k < 2; k++) {
            String s = in.next();
            chars[k] = s.toCharArray();
        }
        dp[0][0] = 1;
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < 2; i++) {
                if (chars[i][j] == '.') {
                    if (i == 0) {
                        dp[i][j] = dp[i][j - 1] + dp[i + 1][j - 1];
                    }
                    if (i == 1) {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(dp[1][n - 1]);
    }
}
