package com.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Solution: HashMap/排序
 * @Title: 数组中出现次数超过一半的数字
 * @Description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * @Author: chenghao.su
 * @Date: 2020/3/6 19:47
 */
public class _39 {
    public static void main(String[] args) {

    }

    // HashMap
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }

    // 排序取中值，因为所求数字超过总数一半，所以中间数字就是所求
    public int majorityElement2(int[] nums) {
        return 0;
    }
}
