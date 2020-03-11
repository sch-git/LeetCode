package com.algorithm.every;

/**
 * @Solution: 数组遍历
 * @Title: 将数组分成和相等的三个部分
 * @Description: 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/11 19:10
 */
public class _1013 {
    public static void main(String[] args) {

    }

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        int indexi = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        for (int i = 0, temp = 0; i < A.length; i++) {
            temp += A[i];
            if (temp == sum / 3) {
                indexi = i;
                break;
            }
        }
        for (int i = indexi + 1, temp = 0; i < A.length - 1; i++) {
            temp += A[i];
            if (temp == sum / 3) {
                return true;
            }
        }
        return false;
    }
}
