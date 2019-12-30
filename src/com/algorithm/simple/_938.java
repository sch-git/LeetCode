package com.algorithm.simple;

/**
 * @Title: 二叉搜索树的范围和
 * @Description: 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * @Author: chenghao.su
 * @Date: 2019/12/30 15:59
 */
public class _938 {

    public static void main(String[] args) {

    }

    // 递归解法
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val >= L && root.val <= R) {
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
        return 0 + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    // 迭代解法 TODO
}
