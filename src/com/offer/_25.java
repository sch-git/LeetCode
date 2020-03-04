package com.offer;

/**
 * @Solution: 比较大小插入新链表
 * @Title: 合并两个排序的链表
 * @Description: 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * @Author: chenghao.su
 * @Date: 2020/3/4 13:33
 */
public class _25 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode root = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ListNode temp = new ListNode(l1.val);
                head.next = temp;
                l1 = l1.next;
            } else {
                ListNode temp = new ListNode(l2.val);
                head.next = temp;
                l2 = l2.next;
            }
            head = head.next;
        }
        while (l1 != null) {
            ListNode temp = new ListNode(l1.val);
            head.next = temp;
            l1 = l1.next;
            head = head.next;
        }
        while (l2 != null) {
            ListNode temp = new ListNode(l2.val);
            head.next = temp;
            l2 = l2.next;
            head = head.next;
        }
        return root.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
