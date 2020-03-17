package com.sort;

/**
 * @Description: 插入排序
 * @Author: chenghao.su
 * @Date: 2020/3/17 21:10
 */
public class InsertSort {
    public static void main(String[] args) {

    }

    public void sort(int[] nums) {
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            // 如果前一位（已排序）的比当前的数大，则往前找到比当前数小的位置
            int j = i - 1;
            while (j >= 0 && nums[j] > temp) {
                // 将数据赋值给后一位
                nums[j + 1] = nums[j];
                j--;
            }
            // 到达边界或nums[j]<当前数
            nums[j + 1] = temp;
        }
    }
}
