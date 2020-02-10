package com.algorithm.medium;

/**
 * @Title: 交替打印
 * @Description: 两个不同的线程将会共用一个 FooBar 实例。其中一个线程将会调用 foo() 方法，另一个线程将会调用 bar() 方法。
 * 请设计修改程序，以确保 "foobar" 被输出 n 次。
 * @Author: chenghao.su
 * @Date: 2020/2/10 22:19
 */
public class _1115 {
    private int n;
    private boolean flag = true;

    public _1115(int n) {
        this.n = n;
    }

    public static void main(String[] args) {

    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (!flag) {
                Thread.yield();
            }
            printFoo.run();
            flag = false;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (flag) {
                Thread.yield();
            }
            printBar.run();
            flag = true;
        }
    }
}
