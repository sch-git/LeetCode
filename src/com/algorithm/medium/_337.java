package com.algorithm.medium;

/**
 * @Title: 打家劫舍 III
 * @Description: 所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 * 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
 * @Author: chenghao.su
 * @Date: 2020/2/13 20:22
 */
public class _337 {
    public static void main(String[] args) {

    }

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] result = dp(root);
        return Math.max(result[0], result[1]);
    }

    int[] dp(TreeNode root) {
        // type[0] 不抢这个节点;type[1] 抢这个节点
        int[] type = new int[2];
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = dp(root.left);
        int[] right = dp(root.right);
        // type[0] 不抢这个节点;根据收益选择是否抢下一个节点
        type[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        // type[1] 抢这个节点;不能抢子节点
        type[1] = left[0] + right[0] + root.val;
        return type;
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
