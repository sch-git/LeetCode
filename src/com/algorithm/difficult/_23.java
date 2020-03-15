package com.algorithm.difficult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Solution: 暴力
 * @Title: 合并K个排序链表
 * @Description: 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * @Author: chenghao.su
 * @Date: 2020/3/15 15:19
 */
public class _23 {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length < 1) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for (ListNode root : lists) {
            while (root != null) {
                list.add(root.val);
                root = root.next;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        ListNode root = new ListNode(-1);
        ListNode head = root;
        for (int i = 0; i < arr.length; i++) {
            head.next = new ListNode(arr[i]);
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
