package com.offer;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 二叉树的深度
 * @Description: 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * @Author: chenghao.su
 * @Date: 2020/2/22 18:53
 */
public class _55 {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root != null) {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        return 0;
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
