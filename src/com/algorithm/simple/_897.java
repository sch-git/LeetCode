package com.algorithm.simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Solution: 树的遍历模板，使用队列保存结点
 * @Title: 递增顺序查找树
 * @Description: 给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 * @Author: chenghao.su
 * @Date: 2020/4/12 23:06
 */
public class _897 {
    private Queue<TreeNode> queue = new LinkedList<>();

    public static void main(String[] args) {

    }

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        increasingBST2(root);
        root = new TreeNode(-1);
        TreeNode temp = root;
        while (!queue.isEmpty()) {
            TreeNode node = new TreeNode(queue.remove().val);
            root.right = node;
            root = root.right;
        }
        return temp.right;
    }

    public void increasingBST2(TreeNode root) {
        if (root == null) {
            return;
        }
        increasingBST2(root.left);
        queue.add(root);
        increasingBST2(root.right);

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
