package com.offer;

/**
 * @Solution: 链表的操作
 * @Title: 从尾到头打印链表
 * @Description: 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * @Author: chenghao.su
 * @Date: 2020/3/4 13:20
 */
public class _06 {
    public static void main(String[] args) {

    }

    // 头插法得到新链表，遍历新链表再复制数组
    public int[] reversePrint(ListNode head) {
        ListNode root = new ListNode(-1);
        int len = 0;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = root.next;
            root.next = temp;
            head = head.next;
            len++;
        }
        int[] arr = new int[len];
        int index = 0;
        root = root.next;
        while (root != null) {
            arr[index++] = root.val;
            root = root.next;
        }
        return arr;
    }
    // 遍历链表得到长度，再倒叙赋值给数组

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
