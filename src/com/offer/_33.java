package com.offer;

/**
 * @Solution: 找到左右子树分界点，递归判断
 * @Title: 二叉搜索树的后序遍历序列
 * @Description: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 * @Author: chenghao.su
 * @Date: 2020/3/29 15:25
 */
public class _33 {
    public static void main(String[] args) {

    }

    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length < 1) {
            return true;
        }
        return exist(postorder, 0, postorder.length - 1);
    }

    public boolean exist(int[] postOrder, int left, int right) {
        if (left >= right) {
            return true;
        }
        // 找到左子树
        int L = left;
        while (postOrder[L] < postOrder[right]) {
            L++;
        }
        // m为左右子树分界点
        int m = L;
        while (postOrder[L] > postOrder[right]) {
            L++;
        }
        // L==right判断右子树是否均大于根结点
        return L == right && exist(postOrder, left, m - 1) && exist(postOrder, m, right - 1);
    }
}
