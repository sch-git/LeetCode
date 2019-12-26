package com.algorithm.simple;

/**
 * @Title: 相同的树
 * @Description: 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * @Author: chenghao.su
 * @Date: 2019/12/26 18:31
 */
public class _100 {
    public static void main(String[] args) {

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result1 = true;
        boolean result2 = true;
        if (p == null && q == null) {
            return true;
        } else if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            result1 = isSameTree(p.left, q.left);
            result2 = isSameTree(p.right, q.right);
        }
        return (result1 && result2);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }
}
