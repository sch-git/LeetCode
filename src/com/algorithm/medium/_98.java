package com.algorithm.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/14 22:24
 */
public class _98 {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return false;
        }
        boolean flag = true;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (root.left != null) {
            stack.push(root.left);
        }
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        stack.push(root);
        if (root.right != null) {
            stack.push(root.right);
        }
        stack.pop();
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp.left != null) {
                list.add(temp.left.val);
            }
            list.add(temp.val);
            if (temp.right != null) {
                list.add(temp.right.val);
            }
        }
        return flag;
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
