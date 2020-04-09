package com.algorithm.simple;

/**
 * @Solution:
 * @Title: 将有序数组转换为二叉搜索树
 * @Description: 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * @Author: chenghao.su
 * @Date: 2020/4/9 14:42
 */
public class _108 {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) {
            return null;
        }
        TreeNode root = sortedArrayToBST(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        if (start > end) {
            return null;
        }
        int mid = ((end - start + 1) >> 1) + start;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
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
