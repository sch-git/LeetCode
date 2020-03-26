package com.algorithm.every;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/26 19:19
 */
public class _999 {
    public static void main(String[] args) {

    }

    public int numRookCaptures(char[][] board) {
        int sum = 0;
        boolean flag = true;
        int i;
        int j = 0;
        // 找到车的位置
        for (i = 0; i < board.length; i++) {
            for (j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        int indexI;
        int indexJ;
        // 上
        for (indexI = i - 1; indexI >= 0; indexI--) {

            if (board[indexI][j] == '.') {
                continue;
            }
            if (board[indexI][j] == 'p') {
                sum++;
            }
            break;
        }
        // 下
        for (indexI = i + 1; indexI < board.length; indexI++) {
            if (board[indexI][j] == '.') {
                continue;
            }
            if (board[indexI][j] == 'p') {
                sum++;
            }
            break;
        }
        // 左
        for (indexJ = j - 1; indexJ >= 0; indexJ--) {
            if (board[i][indexJ] == '.') {
                continue;
            }
            if (board[i][indexJ] == 'p') {
                sum++;
            }
            break;
        }
        // 右
        for (indexJ = j + 1; indexJ < board[i].length; indexJ++) {
            if (board[i][indexJ] == '.') {
                continue;
            }
            if (board[i][indexJ] == 'p') {
                sum++;
            }
            break;
        }
        return sum;
    }
}
