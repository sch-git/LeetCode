package com.algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 二叉树的所有路径
 * @Description: 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * @Author: chenghao.su
 * @Date: 2020/4/13 23:13
 */
public class _257 {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        dfs("", root, list);
        return list;
    }

    public void dfs(String path, TreeNode root, List<String> list) {
        if (root == null) {
            return;
        }
        if (root.left != null || root.right != null) {
            path += root.val + "->";
            dfs(path, root.left, list);
            dfs(path, root.right, list);
        } else {
            path += root.val;
            list.add(path);
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
