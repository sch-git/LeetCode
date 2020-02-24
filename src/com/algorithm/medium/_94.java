package com.algorithm.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 二叉树的中序遍历
 * @Description: 给定一个二叉树，返回它的中序 遍历。
 * @Author: chenghao.su
 * @Date: 2020/2/24 22:18
 */
public class _94 {
    public static void main(String[] args) {

    }

    /**
     * 栈不为空或当前节点存在，进入循环（弹出root节点时，栈为空而右子树还没有遍历）
     * 往栈中添加当前节点，当前节点变为左孩子
     * 当前节点为空时退出循环，说明已经没有左节点了
     * 将栈顶元素弹出，加入结果集，查找它的右子树
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() && node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node = node.right;
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
