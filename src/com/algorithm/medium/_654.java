package com.algorithm.medium;

/**
 * @Title: 最大二叉树
 * @Description: 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * <p>
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * @Author: chenghao.su
 * @Date: 2020/2/9 16:42
 */
public class _654 {
    public static void main(String[] args) {
        int[] re = new int[]{
                3, 2, 1, 6, 0, 5
        };

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return find(nums, 0, nums.length);
    }

    public TreeNode find(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = left; i < right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = find(nums, left, index);
        root.right = find(nums, index + 1, right);
        return root;
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
