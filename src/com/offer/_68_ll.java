package com.offer;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 二叉树的最近公共祖先
 * @Description: 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * @Author: chenghao.su
 * @Date: 2020/2/22 19:47
 */
public class _68_ll {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode leftLast = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLast = lowestCommonAncestor(root.right, p, q);
        if (leftLast == null) {
            return rightLast;
        }
        if (rightLast == null) {
            return leftLast;
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
