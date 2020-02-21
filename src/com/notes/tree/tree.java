package com.notes.tree;

/**
 * @Description: 二叉树遍历框架
 * @Author: chenghao.su
 * @Date: 2020/2/21 20:44
 */
public class tree {
    public static void main(String[] args) {

    }

    /**
     * 二叉树的遍历
     *
     * @param node 当前节点
     */
    public void traverse(TreeNode node) {
        while (node != null) {
            traverse(node.left);
            traverse(node.right);
        }
    }

    public void traverseMul(TreeNodeMul root) {
        while (root != null) {
            for (TreeNodeMul node : root.children) {
                traverseMul(node);
            }
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * N叉树的遍历
     */
    class TreeNodeMul {
        int val;
        TreeNodeMul[] children;
    }
}
