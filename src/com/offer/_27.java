package com.offer;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 二叉树的镜像
 * @Description: 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 * @Author: chenghao.su
 * @Date: 2020/2/21 20:43
 */
public class _27 {
    public static void main(String[] args) {

    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
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
