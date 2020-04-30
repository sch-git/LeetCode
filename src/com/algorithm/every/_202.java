package com.algorithm.every;

import java.util.HashSet;

/**
 * @Title: 快乐数
 * @Description:
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1
 * 也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 * @Author: chenghao.su
 * @Date: 2020/4/30 19:08
 */
public class _202 {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        while (n != 1) {
            int temp = 0;
            while (n != 0) {
                temp = temp + (n % 10) * (n % 10);
                n /= 10;
            }
            if (!set.add(temp)) {
                return false;
            }
            n = temp;
        }
        return true;
    }
}
