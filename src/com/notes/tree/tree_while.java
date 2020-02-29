package com.notes.tree;

import java.util.Stack;

/**
 * @Description: 二叉树循环遍历
 * @Author: chenghao.su
 * @Date: 2020/2/27 10:53
 */
public class tree_while {
    public static void main(String[] args) {

    }

    /**
     * 先序遍历
     *
     * @param root 根节点
     */
    public void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                System.out.println(root.val);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                root = node.right;
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
}
