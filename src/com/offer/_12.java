package com.offer;

/**
 * @Solution: 深度搜索优先
 * @Title: 矩阵中的路径
 * @Description: 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * <p>
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * <p>
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/26 19:44
 */
public class _12 {
    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (exist(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param board 矩阵
     * @param word  字符
     * @param i     行索引
     * @param j     列索引
     * @param k     字符索引
     * @return
     */
    public boolean exist(char[][] board, char[] word, int i, int j, int k) {
        // 终止条件
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        // 保存当前位置的值，标记为已经选择
        char temp = board[i][j];
        board[i][j] = '/';
        // 递推
        boolean res = exist(board, word, i - 1, j, k + 1) || exist(board, word, i + 1, j, k + 1)
                || exist(board, word, i, j - 1, k + 1) || exist(board, word, i, j + 1, k + 1);
        board[i][j] = temp;
        return res;
    }
}
