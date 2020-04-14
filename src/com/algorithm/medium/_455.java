package com.algorithm.medium;

/**
 * @Description: 两数相加 II
 * @Author: chenghao.su
 * @Date: 2020/4/14 22:04
 */
public class _455 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = new ListNode(-1);
        while (l1 != null) {
            ListNode node = new ListNode(l1.val);
            node.next = h1.next;
            h1.next = node;
            l1 = l1.next;
        }
        ListNode h2 = new ListNode(-1);
        while (l2 != null) {
            ListNode node = new ListNode(l2.val);
            node.next = h2.next;
            h2.next = node;
            l2 = l2.next;
        }
        h1 = h1.next;
        h2 = h2.next;
        ListNode result = new ListNode(-1);
        int j = 0;
        while (h1 != null && h2 != null) {
            int sum = h1.val + h2.val;
            sum += j;
            j = 0;
            if (sum >= 10) {
                j = sum / 10;
                sum = sum % 10;
            }
            ListNode node = new ListNode(sum);
            node.next = result.next;
            result.next = node;
            h1 = h1.next;
            h2 = h2.next;
        }
        while (h1 != null) {
            int sum = h1.val + j;
            j = 0;
            if (sum >= 10) {
                j = sum / 10;
                sum = sum % 10;
            }
            ListNode node = new ListNode(sum);
            node.next = result.next;
            result.next = node;
            h1 = h1.next;
        }
        while (h2 != null) {
            int sum = h2.val + j;
            j = 0;
            if (sum >= 10) {
                j = sum / 10;
                sum = sum % 10;
            }
            ListNode node = new ListNode(sum);
            node.next = result.next;
            result.next = node;
            h2 = h2.next;
        }
        if (j != 0) {
            ListNode node = new ListNode(j);
            node.next = result.next;
            result.next = node;
        }
        return result.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
