package com.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Solution: 二叉树遍历框架-中序遍历
 * @Title: 二叉搜索树的第k大节点
 * @Description: 给定一棵二叉搜索树，请找出其中第k大的节点。
 * @Author: chenghao.su
 * @Date: 2020/2/22 19:00
 */
public class _54 {
    public static void main(String[] args) {

    }

    public int kthLargest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        sortTree(root, result);
        return result.get(result.size() - k);
    }

    public void sortTree(TreeNode root, List<Integer> result) {
        if (root != null) {
            sortTree(root.left, result);
            result.add(root.val);
            sortTree(root.right, result);
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
