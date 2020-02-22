package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Solution: 二叉树遍历框架-前序遍历
 * @Title: 从上到下打印二叉树 II
 * @Description: 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 * @Author: chenghao.su
 * @Date: 2020/2/22 19:10
 */
public class _32 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                    temp.add(node.val);
                }
            }
            if (temp.size() > 0) {
                result.add(temp);
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
