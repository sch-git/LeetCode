package com.algorithm.simple;

/**
 * @Solution: 深度搜索，用变量max记录当前最大直径
 * @Title: 二叉树的直径
 * @Description: 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 * @Author: chenghao.su
 * @Date: 2020/3/10 14:26
 */
public class _543 {
    int max;

    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTree2(root, 0);
        return max;
    }

    public int diameterOfBinaryTree2(TreeNode root, int len) {
        if (root == null) {
            return 0;
        }
        int leftLen = diameterOfBinaryTree2(root.left, len);
        int rightLen = diameterOfBinaryTree2(root.right, len);
        max = Math.max(leftLen + rightLen, max);
        return Math.max(leftLen, rightLen) + 1;
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
