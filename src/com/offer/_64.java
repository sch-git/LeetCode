package com.offer;

/**
 * @Solution: 短路 && 特性
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/3 19:20
 */
public class _64 {
    public static void main(String[] args) {

    }

    public int sumNums(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += sumNums(n - 1)) > 0);
        return sum;
    }
}
