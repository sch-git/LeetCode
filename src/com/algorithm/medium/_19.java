package com.algorithm.medium;

/**
 * @Title: 删除链表的倒数第N个节点
 * @Description: 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点
 * @Author: chenghao.su
 * @Date: 2019/12/18 23:04
 */
public class _19 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        ListNode test = removeNthFromEnd(listNode1, 2);
        while (test != null) {
            System.out.println(test.val);
            test = test.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode second = first;
        ListNode result = first;
        int index = 0;
        while (first.next != null) {
            first = first.next;
            if (index != n) {
                index++;
            } else {
                second = second.next;
            }
        }
        if (second.next != null) {
            second.next = second.next.next;
        } else {
            return null;
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
