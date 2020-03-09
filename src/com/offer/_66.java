package com.offer;

/**
 * @Solution: 双数组
 * 令left[i]=a[0]*..a[i-1]
 * right[i]=a[i+1]*a[n-1]
 * result[i]=left[i]*right[i]
 * @Title: 构建乘积数组
 * @Description: 给定一个数组 A[0, 1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/9 15:46
 */
public class _66 {
    public static void main(String[] args) {

    }

    public int[] constructArr(int[] a) {
        if (a.length < 1) {
            return new int[]{};
        }
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        int[] result = new int[a.length];
        left[0] = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        right[a.length - 1] = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }
        for (int i = 0; i < a.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
