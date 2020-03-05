package com.offer;

/**
 * @Solution: 位运算比较
 * @Title: 二进制中1的个数
 * @Description: 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/5 10:45
 */
public class _15 {
    public static void main(String[] args) {

    }

    public int hammingWeight(int n) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                num++;
            }
        }
        return num;
    }
}
