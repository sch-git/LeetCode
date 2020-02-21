package com.offer;

/**
 * @Title: 打印从1到最大的n位数
 * @Description: 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * @Author: chenghao.su
 * @Date: 2020/2/21 19:59
 */
public class _17 {
    public static void main(String[] args) {
    }

    public int[] printNumbers(int n) {
        String time = "1";
        for (int i = 0; i < n; i++) {
            time += "0";
        }
        int[] result = new int[Integer.parseInt(time) - 1];
        for (int i = 0; i < Integer.parseInt(time) - 1; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
