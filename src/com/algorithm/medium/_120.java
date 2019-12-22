package com.algorithm.medium;

import java.util.List;

/**
 * @Title: 三角形最小路径和
 * @Description: 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * @Author: chenghao.su
 * @Date: 2019/12/22 13:44
 */
public class _120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle;
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int minNum = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, triangle.get(i).get(j) + minNum);
            }
        }
        return triangle.get(0).get(0);
    }
}
