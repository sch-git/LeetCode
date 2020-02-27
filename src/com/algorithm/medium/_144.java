package com.algorithm.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Title: 二叉树的前序遍历
 * @Description: 给定一个二叉树，返回它的 前序 遍历。
 * @Author: chenghao.su
 * @Date: 2020/2/27 11:06
 */
public class _144 {
    List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {

    }

    // 递归
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }

    // 迭代
    public List<Integer> preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                result.add(root.val);
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                root = node.right;
            }
        }
        return result;
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
