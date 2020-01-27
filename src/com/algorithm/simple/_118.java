package com.algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 杨辉三角
 * @Description: 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * @Author: chenghao.su
 * @Date: 2020/1/27 12:26
 */
public class _118 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows < 1) {
            return result;
        }
        int[][] map = new int[numRows][numRows];

        map[0][0] = 1;
        List<Integer> initZero = new ArrayList<>();
        initZero.add(map[0][0]);
        result.add(initZero);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j != 0) {
                    map[i][j] = map[i - 1][j] + map[i - 1][j - 1];
                } else {
                    map[i][j] = 1;
                }
                temp.add(map[i][j]);
            }
            result.add(temp);
        }
        return result;
    }
}
