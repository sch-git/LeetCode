package com.algorithm.every;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 用队列构建栈
 * @Author: chenghao.su
 * @Date: 2020/3/1 21:31
 */
public class _3_1 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        int param_3 = stack.top();
        int param_2 = stack.pop();

        boolean param_4 = stack.empty();
    }

    static class MyStack {
        private Queue<Integer> queue;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            queue = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            queue.add(x);
            int size = queue.size();
            while (--size > 0) {
                queue.add(queue.remove());
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            return queue.remove();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return queue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
