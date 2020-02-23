package com.offer;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 平衡二叉树
 * @Description: 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 * @Author: chenghao.su
 * @Date: 2020/2/23 12:09
 */
public class _55_II {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return deep(root) >= 0;
    }

    public int deep(TreeNode root) {
        int leftDeep = 0;
        int rightDeep = 0;
        if (root == null) {
            return 0;
        } else {
            leftDeep = deep(root.left) + 1;
            rightDeep = deep(root.right) + 1;
        }
        if (Math.abs(leftDeep - rightDeep) <= 1 && leftDeep >= 0 && rightDeep >= 0) {
            return Math.max(leftDeep, rightDeep);
        }
        return Integer.MIN_VALUE;
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
