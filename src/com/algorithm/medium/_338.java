package com.algorithm.medium;

/**
 * @Title: 比特位计数
 * @Description: 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 * @Author: chenghao.su
 * @Date: 2020/1/1 19:53
 */
public class _338 {
    public static void main(String[] args) {

    }

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {
                result[i] = result[i / 2];
            } else {
                result[i] = result[i - 1] + 1;
            }
        }
        return result;
    }
}
