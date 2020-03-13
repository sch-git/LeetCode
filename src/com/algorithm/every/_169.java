package com.algorithm.every;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Solution: hash/排序/投票算法
 * @Title: 多数元素
 * @Description: 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * @Author: chenghao.su
 * @Date: 2020/3/13 13:34
 */
public class _169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int maxNum = nums[0];
        int maxValue = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > maxValue) {
                maxValue = map.get(nums[i]);
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public int majorityElement2(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
