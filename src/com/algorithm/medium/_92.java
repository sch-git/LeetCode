package com.algorithm.medium;

/**
 * @Title: 反转链表 II
 * @Description: 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * @Author: chenghao.su
 * @Date: 2020/1/15 20:59
 */
public class _92 {
    public static void main(String[] args) {

    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        ListNode beforeLeft = new ListNode(-1);
        ListNode left = head;
        ListNode right = head;
        ListNode leftHead = null;
        while (--m > 0) {
            leftHead = left;
            left = left.next;
        }
        while (--n > 0) {
            right = right.next;
        }
        boolean flag = true;
        while (left != right.next) {
            ListNode temp = new ListNode(left.val);
            if (flag) {
                temp.next = right.next;
                flag = false;
            } else {
                temp.next = beforeLeft.next;
            }
            beforeLeft.next = temp;
            left = left.next;
        }
        if (leftHead != null) {
            leftHead.next = beforeLeft.next;
        } else {
            head = beforeLeft.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
