package com.algorithm.simple;

/**
 * @Solution: 二叉树递归遍历
 * @Title: 二叉树的最大深度
 * @Description: 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * @Author: chenghao.su
 * @Date: 2020/3/22 22:38
 */
public class _104 {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    // TODO 栈-迭代解法
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
