package com.offer;

/**
 * @Solution: 把绳子尽可能切为多个长度为 3 的片段，留下的最后一段绳子的长度可能为 0,1,2三种情况
 * 若最后一段绳子长度为 2，则保留，不再拆为 1
 * 若最后一段绳子长度为 1；则应把最后的 3 +1 替换为 2 +2，因为 2*2>3*1
 * @Solution: 贪心
 * @Title: 剪绳子
 * @Description: 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/7 09:37
 */
public class _14_I {
    public static void main(String[] args) {

    }

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int mul = n % 3;
        n = n / 3;
        if (mul == 0) {
            return (int) Math.pow(3, n);
        }
        if (mul == 1) {
            return (int) Math.pow(3, n - 1) * 4;
        } else if (mul == 2) {
            return (int) Math.pow(3, n) * 2;
        }
        return 0;
    }
}
