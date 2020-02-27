package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Solution: 二叉树遍历
 * @Title: 序列化二叉树
 * @Description: 请实现两个函数，分别用来序列化和反序列化二叉树。
 * @Author: chenghao.su
 * @Date: 2020/2/26 21:18
 */
public class _37 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = null;
        left.right = null;
        right.left = new TreeNode(2);
        right.right = new TreeNode(4);
        right.left.left = new TreeNode(3);
        right.left.right = new TreeNode(1);
        System.out.println(serialize(root));
        deserialize(serialize(root));
    }

    public static String serialize(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return null;
        }
        // 使用队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node != null) {
                    result.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                } else {
                    result.add(null);
                }
            }
        }
        while (result.get(result.size() - 1) == null) {
            result.remove(result.size() - 1);
        }
        return result.toString();
    }

    public static TreeNode deserialize(String data) {
        if (data == null) {
            return null;
        }
        data = data.substring(1, data.length());
        String temp = "";
        Queue<TreeNode> queue = new LinkedList<>();
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ') {
                continue;
            }
            if (data.charAt(i) != ',' && data.charAt(i) != ']') {
                temp += data.charAt(i);
            }
            if (data.charAt(i) == ',' || data.charAt(i) == ']') {
                if (temp.equals("null")) {
                    queue.add(null);
                } else {
                    queue.add(new TreeNode(Integer.parseInt(temp)));
                }
                temp = "";
            }
        }
        TreeNode root = queue.remove();
        Queue<TreeNode> tempQueue = new LinkedList<>();
        tempQueue.add(root);
        while (!queue.isEmpty()) {
            int size = tempQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = tempQueue.remove();
                if (node != null) {
                    if (!queue.isEmpty()) {
                        node.left = queue.remove();
                    }
                    if (!queue.isEmpty()) {
                        node.right = queue.remove();
                    }
                    tempQueue.add(node.left);
                    tempQueue.add(node.right);
                }
            }
        }
        return root;
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
