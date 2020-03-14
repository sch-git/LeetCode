package com.exam.mihoyou;

/**
 * @Description:
 * @Author: chenghao.su
 * @Date: 2020/3/13 18:44
 */
public class _1 {
    public static void main(String[] args) {
        int[] A = new int[]{
                2, 5, 1, 2, 5
        };
        int[] B = new int[]{
                10, 5, 2, 1, 5, 2
        };
        System.out.println(maxUncrossedLines(A, B));
    }

    public static int maxUncrossedLines(int[] A, int[] B) {
        int lineNum = 0;
        int start = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = start; j < B.length; j++) {
                if (A[i] == B[j]) {
                    start = j + 1;
                    lineNum++;
                    break;
                }
            }
        }
        int temp = 0;
        start = 0;
        for (int i = 0; i < B.length; i++) {
            for (int j = start; j < A.length; j++) {
                if (B[i] == A[j]) {
                    start = j + 1;
                    temp++;
                    break;
                }
            }
        }
        return Math.max(temp, lineNum);
    }
}
