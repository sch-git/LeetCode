package com.offer;

/**
 * @Solution:
 * @Title: 数字序列中某一位的数字
 * @Description: 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 * <p>
 * 请写一个函数，求任意第n位对应的数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/31 14:33
 */
public class _44 {
    public static void main(String[] args) {
        System.out.println(findNthDigit(999999999));
    }

    public static int findNthDigit(int n) {
        // 找到这是几位数
        if (n <= 9) {
            return n;
        }
        long digit = 9;
        int num = 1;
        int temp = n;
        while (temp - digit * num > 0) {
            temp -= digit * num;
            digit *= 10;
            num++;
        }
        // 找到这是具体那个数
        double start = Math.pow(10, num - 1);
        double offset = start + (temp - 1) / num;
        // 找到这是具体数的那个位置
        int cap = temp % num;
        if (cap == 0) {
            return (int) offset % 10;
        }
        while ((num - cap) > 0) {
            cap++;
            offset = offset / 10;
        }
        return (int) offset % 10;
    }
}
