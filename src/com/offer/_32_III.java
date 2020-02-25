package com.offer;

import java.util.*;

/**
 * @Solution: 二叉树遍历
 * @Title: 从上到下打印二叉树 III
 * @Description: 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * @Author: chenghao.su
 * @Date: 2020/2/25 20:34
 */
public class _32_III {
    public static void main(String[] args) {

    }

    /**
     * 用队列添加数据，在循环开始将队列转化为栈，实现逆序输出
     * 3ms
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        stack.add(root);
        boolean flag = true;
        while (!stack.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            while (!queue.isEmpty()) {
                stack.push(queue.remove());
            }
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = stack.pop();
                temp.add(node.val);
                if (flag) {
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                if (!flag) {
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                }
            }
            flag = !flag;
            result.add(temp);
        }
        return result;
    }

    /**
     * 定义一个变量判断当前行结果是否需要逆序，基于_32
     * 1ms
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node != null) {
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    temp.add(node.val);
                }
            }
            if (level % 2 == 0) {
                List<Integer> temp1 = new ArrayList<>(size);
                for (int i = temp.size() - 1; i >= 0; i--) {
                    temp1.add(temp.get(i));
                }
                result.add(temp1);
            } else {
                result.add(temp);
            }
            level++;
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

