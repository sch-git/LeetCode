package com.algorithm.medium;

/**
 * @Title: 删除给定值的叶子节点
 * @Solution: 二叉树遍历-前序
 * @Description: 给你一棵以 root 为根的二叉树和一个整数 target ，请你删除所有值为 target 的 叶子节点 。
 * @Author: chenghao.su
 * @Date: 2020/2/28 21:11
 */
public class _1325 {
    public static void main(String[] args) {

    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return root;
        }
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.val == target && root.left == null && root.right == null) {
            root = null;
        }
        return root;
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
