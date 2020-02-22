package com.offer;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 二叉搜索树的最近公共祖先
 * @Description: 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。一个节点也可以是它自己的祖先）。”
 * @Author: chenghao.su
 * @Date: 2020/2/22 19:30
 */
public class _68 {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /**
         * 当p,q位于左右子树时，即为公共祖先
         */
        while (root != null) {
            if (root.val >= Math.min(p.val, q.val) && root.val <= Math.max(p.val, q.val)) {
                return root;
            }
            if (root.val > Math.max(p.val, q.val)) {
                root = root.left;
            }
            if (root.val < Math.min(p.val, q.val)) {
                root = root.right;
            }
        }
        return null;
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
