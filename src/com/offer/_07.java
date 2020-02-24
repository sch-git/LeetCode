package com.offer;

/**
 * @Solution: 二叉树遍历框架
 * @Title: 重建二叉树
 * @Description: 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * @Author: chenghao.su
 * @Date: 2020/2/24 11:52
 */
public class _07 {
    public static void main(String[] args) {
        int[] pre = new int[]{3, 9, 20, 15, 7};
        int[] in = new int[]{9, 3, 15, 20, 7};
        buildTree(pre, in);
    }

    /**
     * 前序遍历的数组的左区间pre_left和右区间pre_right
     * 中序遍历的数组的左区间in_left和右区间in_right
     * 根据左区间pre_left，in_left构建左子树，根据右区间pre_right，in_right构建右子树
     *
     * @param preorder 前序数组
     * @param inorder  中序数组
     * @return
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null && inorder == null) {
            return null;
        }
        if (preorder.length < 1 && inorder.length < 1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                int[] pre_left = arrCopy(preorder, 1, i + 1);
                int[] pre_right = arrCopy(preorder, i + 1, preorder.length);
                int[] in_left = arrCopy(inorder, 0, i);
                int[] in_right = arrCopy(inorder, i + 1, inorder.length);
                root.left = buildTree(pre_left, in_left);
                root.right = buildTree(pre_right, in_right);
            }
        }
        return root;
    }

    public static int[] arrCopy(int[] arr, int start, int end) {
        int[] result = new int[end - start];
        if (arr.length <= start) {
            return null;
        }
        for (int i = start; i < end; i++) {
            result[i - start] = arr[i];
        }
        return result;
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
