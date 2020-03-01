package com.offer;

/**
 * @Solution: 定义一个新的头节点，使用头插法
 * @Title: 反转链表
 * @Description: 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * @Author: chenghao.su
 * @Date: 2020/3/1 19:50
 */
public class _24 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode root = new ListNode(-1);
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = root.next;
            root.next = temp;
            head = head.next;
        }
        return root.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
