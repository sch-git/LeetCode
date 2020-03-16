package com.offer;

import java.util.Stack;

/**
 * @Solution: 入栈与出栈时进行判断，
 * 入栈：保证最小值之前是前一个最小值；
 * 出栈：最小值出栈，将前一个最小值也出栈并赋值给min
 * @Title: 包含min函数的栈
 * @Description: 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @Author: chenghao.su
 * @Date: 2020/3/16 14:48
 */
public class _30 {
    public static void main(String[] args) {

    }
}

class MinStack {
    private Stack<Integer> stack;
    private int min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        // 在插入元素时，如果比最小值小则插入最小值，如min=2,x=1;stack=[2,2,1]
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        // 如果出栈的是当前最小值，则修改最小值为之前的最小值
        // 入栈2，3，1，0，则stack=[2,2,3,2,1,1,0]
        if (stack.pop() == min) {
            min = stack.pop();
            // 栈空初始化min
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
