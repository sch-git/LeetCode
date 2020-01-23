package com.algorithm.simple;

/**
 * @Description: IP 地址无效化
 * @Author: chenghao.su
 * @Date: 2020/1/23 10:50
 */
public class _1108 {
    public static void main(String[] args) {

    }

    public static String defangIPaddr(String address) {
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                result += "[.]";
            } else {
                result += ch;
            }
        }
        return result;
    }
}
