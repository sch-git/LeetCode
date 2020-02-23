package com.offer;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 对称的二叉树
 * @Description: 用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * @Author: chenghao.su
 * @Date: 2020/2/23 13:23
 */
public class _28 {
    boolean flag = true;

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            mirrow(root.left, root.right);
        }
        return flag;
    }

    public void mirrow(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            if (left.val != right.val) {
                flag = false;
                return;
            }
            mirrow(left.left, right.right);
            mirrow(left.right, right.left);
        } else if (left == null && right == null) {
            return;
        } else {
            flag = false;
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
