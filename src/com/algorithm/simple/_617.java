package com.algorithm.simple;

/**
 * @Title: 合并二叉树
 * @Description: 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * 合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 * @Author: chenghao.su
 * @Date: 2019/12/30 16:10
 */
public class _617 {
    public static void main(String[] args) {

    }

    // 递归
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode resultTree = new TreeNode(0);
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 != null) {
            resultTree.val += t1.val;
        }
        if (t2 != null) {
            resultTree.val += t2.val;
        }
        resultTree.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        resultTree.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return resultTree;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
