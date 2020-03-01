package com.offer;

/**
 * @Solution: 定义一个当前节点的前节点，找到相等的节点时，让前节点指向下一个节点
 * @Title: 删除链表的节点
 * @Description: 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。返回删除后的链表的头节点。
 * @Author: chenghao.su
 * @Date: 2020/3/1 19:41
 */
public class _18 {
    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode pre = root;
        ListNode now = head;
        while (now.val != val) {
            now = now.next;
            pre = pre.next;
        }
        pre = pre.next.next;
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
