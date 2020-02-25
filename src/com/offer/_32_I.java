package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Solution: 二叉树遍历
 * @Title: 从上到下打印二叉树
 * @Description: 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * @Author: chenghao.su
 * @Date: 2020/2/25 20:00
 */
public class _32_I {
    public static void main(String[] args) {

    }

    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node != null) {
                    list.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
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
