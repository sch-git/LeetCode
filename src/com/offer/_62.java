package com.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Solution: 链表/数学-约瑟夫环
 * @Title: 圆圈中最后剩下的数字
 * @Description:
 * @Author: chenghao.su
 * @Date: 2020/3/9 16:19
 */
public class _62 {
    public static void main(String[] args) {

    }

    public int lastRemaining(int n, int m) {
        if (n == 1) {
            return 0;
        }
        // 初始化
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = (m - 1) % n;
        while (list.size() > 1) {

            list.remove(index);
            index = (index + m - 1) % list.size();
        }
        return list.get(0);
    }
}
