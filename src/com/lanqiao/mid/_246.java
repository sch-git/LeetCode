package com.lanqiao.mid;

import java.util.Scanner;

/**
 * @Title: 猴子吃包子
 * @Description: 　　从前，有一只吃包子很厉害的猴子，它可以吃无数个包子，但是，它吃不同的包子速度也不同；肉包每秒钟吃x个；韭菜包每秒钟吃y个；没有馅的包子每秒钟吃z个；现在有x1个肉包，y1个韭菜包，z1个没有馅的包子；问：猴子吃完这些包子要多久？结果保留p位小数。
 * @Author: chenghao.su
 * @Date: 2020/4/15 20:30
 */
public class _246 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        double fl = in.nextDouble();
        double sum = x1 / x + y1 / y + z1 / z;
        System.out.printf("%.2f\n", sum);

    }
}
