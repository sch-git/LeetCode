package com.algorithm.simple;

/**
 * @Solution: 1. 找数组中点作为当前 root 节点
 * 2. 将数组根据中点拆分为左右两部分，root 的左右节点为左右部分的结果
 * 3. 重复上述步骤
 * PS: 1. 判断数组是否为空 2. 判断拆分的数组是否符合条件
 * @Title: 最小高度树
 * @Description: 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 * @Author: chenghao.su
 * @Date: 2020/4/8 12:40
 */
public class _04_02 {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) {
            return null;
        }
        int index = nums.length / 2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = sortedArrayToBST2(nums, 0, index - 1);
        root.left = sortedArrayToBST2(nums, index + 1, nums.length - 1);
        return root;
    }

    public TreeNode sortedArrayToBST2(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (end == start) {
            return new TreeNode(nums[start]);
        }
        int len = end - start + 1;
        int index = start + len / 2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = sortedArrayToBST2(nums, start, index - 1);
        root.right = sortedArrayToBST2(nums, index + 1, end);
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
