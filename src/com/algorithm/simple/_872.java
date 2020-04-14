package com.algorithm.simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Solution: 中序遍历保存叶子节点的值，进行比较判断
 * @Title: 叶子相似的树
 * @Description: 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 * 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
 * @Author: chenghao.su
 * @Date: 2020/4/14 22:35
 */
public class _872 {
    public static void main(String[] args) {

    }


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == root2) {
            return true;
        } else if (root1 != null || root2 != null) {
            return false;
        }
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        dfs(root1, queue1);
        dfs(root2, queue2);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            if (!queue1.remove().equals(queue2.remove())) {
                return false;
            }
        }
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public void dfs(TreeNode root, Queue<Integer> queue) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            queue.add(root.val);
        }
        dfs(root.left, queue);
        dfs(root.right, queue);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
