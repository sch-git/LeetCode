package com.algorithm.medium;

/**
 * @Solution: 二叉树遍历
 * @Title: 二叉树的最近公共祖先
 * @Description: 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * @Author: chenghao.su
 * @Date: 2020/2/24 23:21
 */
public class _236 {
    public static void main(String[] args) {

    }

    /**
     * 如果当前节点为null或等于p/q，直接返回
     * 否则判断当前节点的左右子树
     * 如果left和right都为null，则当前节点不是公共祖先节点
     * 如果left和right都不为null，说明当前节点是公共祖先节点
     * 如果left和right一者为null，则说明另一者是公共祖先节点
     *
     * @param root 当前节点
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left == null && right == null) {
            return null;
        }
        return left == null ? right : left;

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
