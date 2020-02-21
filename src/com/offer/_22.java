package com.offer;

/**
 * @Solution: 快慢指针
 * @Title: 链表中倒数第k个节点
 * @Description: 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * @Author: chenghao.su
 * @Date: 2020/2/21 20:09
 */
public class _22 {
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode beHead = new ListNode(-1);
        beHead.next = head;
        int index = 0;
        ListNode first = beHead;
        ListNode last = beHead;
        while (index < k) {
            first = first.next;
            index++;
        }
        while (first != null) {
            first = first.next;
            last = last.next;
        }
        return last;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
