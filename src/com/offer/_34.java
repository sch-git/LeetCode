package com.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Solution: 二叉树遍历
 * @Title: 二叉树中和为某一值的路径
 * @Description: 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 * @Author: chenghao.su
 * @Date: 2020/2/25 22:12
 */
public class _34 {
    public static void main(String[] args) {
        // 注意负数
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        pathSum(result, root, new ArrayList<>(arr), 0, sum);
        return result;
    }

    public void pathSum(List<List<Integer>> result, TreeNode root, List<Integer> arr, int nodeSum, int sum) {
        if (root != null) {
            arr.add(root.val);
            nodeSum += root.val;
        }
        if (root.left == null && root.right == null && sum == nodeSum) {
            result.add(new ArrayList<>(arr));
        }
        if (root != null) {
            pathSum(result, root.left, new ArrayList<>(arr), nodeSum, sum);
            pathSum(result, root.right, new ArrayList<>(arr), nodeSum, sum);
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
}
