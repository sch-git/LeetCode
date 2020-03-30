package com.algorithm.simple;

/**
 * @Solution: 动态规划-递推
 * @Title: 按摩师
 * @Description: 一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/the-masseuse-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/30 16:21
 */
public class _17_16 {
    public static void main(String[] args) {

    }

    /**
     * nums[i] 表示到达第 i 个位置时的最大值
     *
     * @param nums 数据
     * @return 最大值
     */
    public int massage(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        nums[1] = Math.max(nums[0], nums[1]);
        if (nums.length == 2) {
            return nums[1];
        }
        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i] + nums[i - 2], nums[i - 1]);
        }
        return nums[nums.length - 1];
    }
}
