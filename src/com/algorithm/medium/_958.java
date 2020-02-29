package com.algorithm.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Solution: 二叉树层序遍历
 * @Title: 二叉树的完全性检验
 * @Description: 给定一个二叉树，确定它是否是一个完全二叉树。
 * 若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2h 个节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/2/29 19:50
 */
public class _958 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        isCompleteTree(root);
    }

    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node == null) {
                    if (queue.size() > 0) {
                        return false;
                    }
                } else {
                    if (node.left != null) {
                        queue.add(node.left);
                        queue.add(node.right);
                    }
                    if (node.left == null && node.right != null) {
                        return false;
                    }
                    if (node.left == null && node.right == null) {
                        flag = true;
                    }
                    if (flag && (node.left != null || node.right != null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
