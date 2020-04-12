package com.exam.wyhy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/4/11 21:10
 */
public class _3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        char[][] source = new char[N][M];
        char[][] friend = new char[N][M];
        for (int i = 0; i < N; i++) {
            source[i] = in.next().toCharArray();
        }
        List<String> list = new ArrayList<>();
        int flag = 1;
        in.nextLine();
        while (in.hasNext()) {

            String str = in.nextLine();
            if (str.equals("0 0 N 0 0")) {
                break;
            }
            char[] chs = str.toCharArray();
            int i = chs[0] - 48;
            int j = chs[2] - 48;
            int p = chs[6] - 48;
            int q = chs[8] - 48;
            if (chs[4] == 'Y') {
                if (friend[i - 1][j - 1] != '\0') {
                    System.out.println(friend[i - 1][j - 1]);
                    friend[p - 1][q - 1] = friend[i - 1][j - 1];
                } else if (friend[p - 1][q - 1] != 0) {
                    friend[i - 1][j - 1] = friend[p - 1][q - 1];
                } else {
                    friend[i - 1][j - 1] = (char) flag;
                    flag++;
                }
            } else {
                list.add(str);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(friend[i][j]);
            }
            System.out.println();
        }
    }
}
