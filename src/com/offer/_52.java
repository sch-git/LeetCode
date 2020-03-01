package com.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Solution:
 * @Title: 两个链表的第一个公共节点
 * @Description: 输入两个链表，找出它们的第一个公共节点。
 * @Author: chenghao.su
 * @Date: 2020/3/1 20:18
 */
public class _52 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int leftLen = 0;
        int rightLen = 0;
        ListNode temp = headA;
        while (temp != null) {
            temp = temp.next;
            leftLen++;
        }
        temp = headB;
        while (temp != null) {
            temp = temp.next;
            rightLen++;
        }
        int distance = Math.abs(leftLen - rightLen);
        if (leftLen > rightLen) {
            while (headB != null) {
                headA = headA.next;
                if (--distance <= 0) {
                    if (headA == headB) {
                        return headA;
                    }
                    headB = headB.next;
                }
            }
        } else if (rightLen > leftLen) {
            while (headA != null) {
                headB = headB.next;
                if (--distance <= 0) {
                    if (headA == headB) {
                        return headA;
                    }
                    headA = headA.next;
                }
            }
        } else {
            while (headA != null && headB != null) {
                if (headA == headB) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        Map<Object, Object> map = new HashMap<>();
        while (headA != null) {
            map.put(headA, headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (map.get(headB) != null) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
