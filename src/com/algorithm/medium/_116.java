package com.algorithm.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Title: 填充每个节点的下一个右侧节点指针
 * @Description: 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL
 * @Author: chenghao.su
 * @Date: 2020/5/4 17:29
 */
public class _116 {
    public static void main(String[] args) {

    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            Node node = queue.remove();
            for (int i = 0; i < len; i++) {
                if (node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                    if (i < len-1) {
                        node.next = queue.remove();
                        node = node.next;
                    }
                }
            }
        }
        return root;
    }

    class Node {
        int val;
        Node left;
        Node right;
        Node next;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
}
