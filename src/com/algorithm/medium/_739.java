package com.algorithm.medium;

import java.util.Stack;

/**
 * @Title: 每日温度
 * @Description: 根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
 * @Author: chenghao.su
 * @Date: 2020/1/14 14:12
 */
public class _739 {
    public static void main(String[] args) {
        int[] tem = new int[]{
                73, 74, 75, 71, 69, 72, 76, 73
        };
        int[] re = dailyTemperatures(tem);
        for (int num : re) {
//            System.out.println(num);
        }
    }

    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> temperature = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int len = T.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            while (!temperature.isEmpty()) {
                int topTem = temperature.pop();
                int topIndex = index.pop();
                if (T[i] > topTem) {
                    result[topIndex] = i - topIndex;
                } else {
                    index.push(topIndex);
                    temperature.push(topTem);
                    break;
                }
            }
            index.push(i);
            temperature.push(T[i]);
        }
        return result;
    }
}
