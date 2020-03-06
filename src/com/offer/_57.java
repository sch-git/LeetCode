package com.offer;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/5 10:58
 */
public class _57 {
    public static void main(String[] args) {
        findContinuousSequence(87760);
    }

    public static int[][] findContinuousSequence(int target) {
        int left;
        int right = target / 2 + 1;
        int[][] result = new int[target][];
        int index = 0;
        for (int i = 1; i < target / 2 + 1; i++) {
            left = i;
            right = target / 2 + 1;
            while (left < right) {
                int sum = ((left + right) * (right - left + 1)) / 2;
                if (sum < target) {
                    left++;
                }
                if (sum > target) {
                    right--;
                }
                if (sum == target) {
                    result[index] = new int[right - left + 1];
                    for (int k = 0; k <= right - left; k++) {
                        result[index][k] = left + k;
                    }
                    index++;
                    break;
                }
            }
        }
        int[][] ans = new int[index][];
        for (int i = 0; i < index; i++) {
            ans[i] = new int[result[i].length];
            for (int j = 0; j < result[i].length; j++) {
                ans[i][j] = result[i][j];
            }
        }
        return ans;
    }
}
