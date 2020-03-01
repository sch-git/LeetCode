package com.algorithm.difficult;

/**
 * @Solution: 二叉树后续遍历
 * @Title: 二叉树中的最大路径和
 * @Description: 给定一个非空二叉树，返回其最大路径和。
 * <p>
 * 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 * @Author: chenghao.su
 * @Date: 2020/3/1 21:54
 */
public class _124 {
    int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {

    }

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int rootVal = findMax(root);
        return maxSum > rootVal ? maxSum : rootVal;
    }

    public int findMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = findMax(root.left);
        int maxRight = findMax(root.right);
        int child = Math.max(maxLeft, maxRight) + root.val;
        child = Math.max(child, root.val);
        maxSum = Math.max(maxSum, Math.max(maxLeft + maxRight + root.val, child));
        return child;
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
