package com.algorithm.medium;

/**
 * @Title: Z字形变换
 * @Description: 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * @Author: chenghao.su
 * @Date: 2019/12/11 14:48
 */
public class _6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 1));
    }

    public static String convert(String s, int numRows) {
        char[][] chList = new char[numRows][s.length()];
        int nowRow = 0;
        int nowCol = 0;
        boolean up = true;
        if (numRows == 1) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            chList[nowRow][nowCol] = s.charAt(i);
            if (nowRow < numRows - 1 && up) {
                nowRow++;
            }
            if (!up && nowRow > 0) {
                nowRow--;
                nowCol += 2;
            }
            if ((!up && nowRow == 0) || (up && nowRow == numRows - 1)) {
                up = !up;
            }
        }
        String result = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < chList[i].length; j++) {
                if (chList[i][j] == '\u0000') {
                    continue;
                }
                result += chList[i][j];

            }
        }
        return result;
    }
}
