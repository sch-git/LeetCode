package com.algorithm.medium;

;

/**
 * @Title: 盛最多水的容器
 * @Description: 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * @Author: chenghao.su
 * @Date: 2019/12/11 17:39
 */
public class _11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{4, 4, 2, 11, 0, 11, 5, 11, 13, 8}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] >= height[right]) {
                right--;
            } else if (height[right] > height[left]) {
                left++;
            }
        }
        return max;
    }
}
