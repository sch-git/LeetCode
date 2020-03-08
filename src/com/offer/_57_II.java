package com.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Solution: 如果sum < target 说明指针right还可以向右移动使sum扩大
 * 如果sum > target说明以left为起点不存在一个right使得sum=target，此时要枚举下一个起点，指针left右移
 * 如果sum==target，把[left，right]区间保存到答案，枚举下一个起点
 * @Title: 和为s的连续正数序列
 * @Description: 双指针
 * @Author: chenghao.su
 * @Date: 2020/3/5 10:58
 */
public class _57_II {
    public static void main(String[] args) {
        findContinuousSequence(87760);
    }

    public static int[][] findContinuousSequence(int target) {
        int left;
        int right;
        List<List<Integer>> list = new ArrayList<>();
        for (left = 1; left <= target / 2 + 1; left++) {
            int sum = 0;
            for (right = left + 1; right <= target / 2 + 2; right++) {
                sum = (left + right) * (right - left + 1) / 2;
                if (sum == target) {
                    List<Integer> temp = new ArrayList<>();
                    for (int i = left; i <= right; i++) {
                        temp.add(i);
                    }
                    list.add(temp);
                    break;
                } else if (sum > target) {
                    break;
                }
            }
        }
        int[][] ans = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            int[] temp = new int[list.get(i).size()];
            for (int j = 0; j < list.get(i).size(); j++) {
                temp[j] = list.get(i).get(j);
            }
            ans[i] = temp;
        }
        return ans;
    }
}
