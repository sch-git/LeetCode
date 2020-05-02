package com.algorithm.every;

/**
 * @Title: 合并两个有序链表
 * @Description: 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @Author: chenghao.su
 * @Date: 2020/5/1 17:42
 */
public class _21 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode newHead = head;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                ListNode temp = new ListNode(l2.val);
                newHead.next = temp;
                l2 = l2.next;
            }else{
                ListNode temp = new ListNode(l1.val);
                newHead.next = temp;
                l1 = l1.next;
            }
            newHead = newHead.next;
        }
        while(l1!=null){
            ListNode temp = new ListNode(l1.val);
            newHead.next = temp;
            newHead = newHead.next;
            l1 = l1.next;
        }
        while(l2!=null){
            ListNode temp = new ListNode(l2.val);
            newHead.next = temp;
            newHead = newHead.next;
            l2 = l2.next;
        }
        return head.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
}
