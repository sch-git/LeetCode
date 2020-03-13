package com.offer;

/**
 * @Solution: 二叉树中序遍历
 * @Title: 二叉搜索树与双向链表
 * @Description: 二叉搜索树与双向链表
 * @Author: chenghao.su
 * @Date: 2020/3/13 13:58
 */
public class _36 {
    Node head, pre;

    public static void main(String[] args) {

    }

    public Node treeToDoublyList(Node root) {
        process(root);
        head.left = pre;
        pre.right = head;
        return root;
    }

    public void process(Node root) {
        if (root == null) {
            return;
        }
        process(root.left);
        root.left = pre;
        if (pre == null) {
            head = root;
            System.out.println(head.val);
        } else {
            pre.right = root;
        }
        pre = root;
        process(root.right);
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}
