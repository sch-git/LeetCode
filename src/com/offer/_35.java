package com.offer;

/**
 * @Solution: 将复制节点插入原链表，之后在分离
 * @Title: 复杂链表的复制
 * @Description: 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/1 19:57
 */
public class _35 {
    public static void main(String[] args) {

    }

    public Node CopyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node root = head;
        // 复制节点，使复制节点在原节点的下一个节点
        while (root != null) {
            Node copyNode = new Node(root.val);
            copyNode.next = root.next;
            root.next = copyNode;
            root = root.next.next;
        }
        // 让复制节点的random指向原节点的random的下一个节点（注意原节点的random是否为null）
        root = head;
        while (root != null) {
            if (root.random == null) {
                root.next.random = root.random;
            } else {
                root.next.random = root.random.next;
            }
            root = root.next.next;
        }
        // 还原原链表，构建复制链表
        root = head;
        Node result = head.next;
        Node temp = head.next;
        while (root != null) {
            root.next = root.next.next;
            if (root.next != null) {
                result.next = root.next.next;
            } else {
                result.next = root.next;
            }
            root = root.next;
            result = result.next;
        }
        return temp;
    }

    class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
