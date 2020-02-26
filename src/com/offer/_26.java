package com.offer;

/**
 * @Solution: 二叉树遍历
 * @Title: 树的子结构
 * @Description: 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * @Author: chenghao.su
 * @Date: 2020/2/26 20:34
 */
public class _26 {
    public static void main(String[] args) {

    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) {
            return false;
        }
        /**
         * 找到与B的根节点相同的A中的节点
         */
        TreeNode root = findRoot(A, B);
        if (root == null) {
            return false;
        }
        return isSubStructure2(root, B);
    }

    public boolean isSubStructure2(TreeNode A, TreeNode B) {
        /**
         * 如果A==null，需要判断是否B==null，如果不等说明B不是A的子结构
         * 如果B==null，不管是否A==null，都说明B是A的子结构
         */
        if (A == null) {
            return B == null;
        }
        if (B == null) {
            return true;
        }
        if (A.val != B.val) {
            return false;
        }
        boolean flagLeft = isSubStructure2(A.left, B.left);
        boolean flagRight = isSubStructure2(A.right, B.right);
        if (flagLeft) {
            return flagRight;
        }
        if (flagRight) {
            return flagLeft;
        }
        return false;
    }

    public TreeNode findRoot(TreeNode aRoot, TreeNode bRoot) {
        if (aRoot == null || aRoot.val == bRoot.val) {
            return aRoot;
        }
        TreeNode left = findRoot(aRoot.left, bRoot);
        TreeNode right = findRoot(aRoot.right, bRoot);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return null;
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
