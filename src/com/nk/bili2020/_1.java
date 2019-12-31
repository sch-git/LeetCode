package com.nk.bili2020;

import java.util.Scanner;

/**
 * @Description: 原地翻转句子中单词的顺序，但单词内字符的顺序不变。要求：空间复杂度O(1)，时间复杂度O(n)。
 * @Author: chenghao.su
 * @Date: 2019/12/31 14:56
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strList = str.split(" ");
        for (int n = strList.length - 1; n >= 0; n--) {
            System.out.print(strList[n]);
            System.out.print(" ");
        }
    }
}
