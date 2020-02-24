package com.algorithm.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 二叉搜索树中第K小的元素
 * @Description: 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 * @Author: chenghao.su
 * @Date: 2020/2/24 22:39
 */
public class _230 {
    /**
     * 递归解法
     */
    List<Integer> re = new ArrayList<>();

    public static void main(String[] args) {

    }

    // 循环解法
    public int kthSmallest(TreeNode root, int k) {
        int index = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if (++index == k) {
                return node.val;
            }

            node = node.right;
        }
        return -1;
    }

    public int kthSmallest2(TreeNode root, int k) {
        kthSmallest3(root);
        return re.get(k - 1);
    }

    public TreeNode kthSmallest3(TreeNode root) {
        if (root != null) {
            root.left = kthSmallest3(root.left);
            re.add(root.val);
            root.right = kthSmallest3(root.right);
        }
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
