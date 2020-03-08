package com.offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Solution:
 * @Title: 队列的最大值
 * @Description: 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/8 15:20
 */
public class _59_II {
    public static void main(String[] args) {

    }

}

class MaxQueue {
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> deque = new LinkedList<>();

    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peek();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.removeLast();
        }

        deque.add(value);

    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int value = queue.remove();
        if (value == deque.peek()) {
            deque.remove();
        }
        return value;
    }
}