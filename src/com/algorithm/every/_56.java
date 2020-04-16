package com.algorithm.every;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Title: 合并区间
 * @Description: 给出一个区间的集合，请合并所有重叠的区间。
 * @Author: chenghao.su
 * @Date: 2020/4/16 15:54
 */
public class _56 {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        // 判断输入是否为空 []
        if (intervals.length < 1) {
            return null;
        }
        List<int[]> list = new ArrayList<>();
        for (int[] num : intervals) {
            list.add(num);
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                } else if (o1[0] < o2[0]) {
                    return -1;
                } else {
                    if (o1[1] > o2[1]) {
                        return 1;
                    } else if (o1[1] < o2[1]) {
                        return -1;
                    }
                }
                return 0;
            }
        });

        List<int[]> result = new ArrayList<>();
        result.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            int[] now = list.get(i);
            int[] old = result.get(result.size() - 1);
            if (now[0] < old[1]) {
                // 判断范围是否被包含[1,4],[2,3]
                if (now[1] < old[1]) {
                    continue;
                }
                result.set(result.size() - 1, new int[]{old[0], now[1]});
            } else {
                result.add(now);
            }
        }
        int[][] arr = new int[result.size()][2];
        int i = 0;
        for (int[] temp : result) {
            arr[i++] = temp;
        }
        return arr;
    }
}
