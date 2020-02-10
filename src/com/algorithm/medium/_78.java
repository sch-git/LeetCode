package com.algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 子集
 * @Description: 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 说明：解集不能包含重复的子集。
 * @Author: chenghao.su
 * @Date: 2020/2/10 21:46
 */
public class _78 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                1, 2, 3
        };
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        if (nums.length <= 0) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> list = result.get(j);
                List<Integer> temp = new ArrayList<>(list);
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }
}
