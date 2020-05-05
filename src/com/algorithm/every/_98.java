package com.algorithm.every;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 验证二叉搜索树
 * @Description: 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * @Author: chenghao.su
 * @Date: 2020/5/5 17:43
 */
public class _98 {
    List<TreeNode> list = new ArrayList<>();

    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        mid(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).val <= list.get(i - 1).val) {
                return false;
            }
        }
        return true;
    }

    public TreeNode mid(TreeNode root) {
        if (root.left != null) {
            mid(root.left);
        }
        list.add(root);
        if (root.right != null) {
            mid(root.right);
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
