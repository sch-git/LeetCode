package com.offer;

import java.util.PriorityQueue;

/**
 * @Solution: 大顶堆小顶堆-PriorityQueue解法
 * @Title: 数据流中的中位数
 * @Description: 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/22 21:51
 */
public class _41 {
    public static void main(String[] args) {

    }
}

class MedianFinder {
    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;
    // 当前所有元素数量
    private int N;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        // 大顶堆 存储左边元素
        left = new PriorityQueue<>((o1, o2) -> o2 - o1);
        // 小顶堆 存储右边元素,且右边元素总是大于左边
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (N % 2 == 0) {
            left.add(num);
            right.add(left.poll());
        } else {
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public double findMedian() {
        if (N % 2 == 0) {
            return (right.peek() + left.peek() * 1.0) / 2;
        } else {
            return right.peek();
        }
    }
}