package com.algorithm.medium;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/1 20:47
 */
public class _951 {
    public static void main(String[] args) {

    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return true;
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
