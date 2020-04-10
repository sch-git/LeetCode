package com.algorithm.simple;

import java.util.List;

/**
 * @Solution: 递归
 * @Title: N叉树的最大深度
 * @Description: 给定一个 N 叉树，找到其最大深度。最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * @Author: chenghao.su
 * @Date: 2020/4/10 19:32
 */
public class _559 {
    public static void main(String[] args) {

    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node node : root.children) {
            max = Math.max(maxDepth(node), max);
        }
        return 1 + max;
    }

    class Node {
        int val;
        List<Node> children;

        public Node() {
        }

        Node(int val) {
            this.val = val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
