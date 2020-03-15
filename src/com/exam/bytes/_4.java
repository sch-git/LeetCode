package com.exam.bytes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/3/15 19:23
 */
public class _4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = in.next().toCharArray();
        }
        int q = in.nextInt();
        int x1, y1, x2, y2;
        List<String> result = new ArrayList<>(q);
        for (int i = 0; i < q; i++) {
            x1 = in.nextInt() - 1;
            y1 = in.nextInt() - 1;
            x2 = in.nextInt() - 1;
            y2 = in.nextInt() - 1;
            if (x1 < 0 || x1 >= n || x2 < 0 || x2 >= n || y1 < 0 || y1 >= m || y2 < 0 || y2 >= m) {
                result.add("NO");
                continue;
            }
            if (x1 != x2 && y1 != y2) {
                result.add("NO");
                continue;
            }
            if (Math.abs(x1 - x2) > 4 || Math.abs(y1 - y2) > 4) {
                result.add("NO");
                continue;
            }
            if (x1 == x2) {
                if (Math.abs(y1 - y2) == 1) {
                    if (matrix[x1][y1] == matrix[x2][y2]) {
                        result.add("YES");
                        matrix[x1][y1] = ' ';
                        matrix[x2][y2] = ' ';
                    } else {
                        result.add("NO");
                    }
                } else {
                    boolean flag = true;
                    int index = 0;
                    for (int xk = Math.max(0, x1 - 1); xk >= 0 && xk <= n && index < 3; xk++) {
                        flag = true;
                        for (int k = Math.min(y1, y2) + 1; k < Math.max(y1, y2); k++) {
                            if (matrix[xk][k] != ' ' && matrix[xk][k] != '.') {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            break;
                        }
                        index++;
                    }
                    if (flag) {
                        if (matrix[x1][y1] == matrix[x2][y2]) {
                            result.add("YES");
                            matrix[x1][y1] = ' ';
                            matrix[x2][y2] = ' ';
                        } else {
                            result.add("NO");
                        }
                    } else {
                        result.add("NO");
                    }
                }
            }
            if (y1 == y2) {
                if (Math.abs(x1 - x2) == 1) {
                    if (matrix[x1][y1] == matrix[x2][y2]) {
                        result.add("YES");
                        matrix[x1][y1] = ' ';
                        matrix[x2][y2] = ' ';
                    } else {
                        result.add("NO");
                    }
                } else {
                    boolean flag = true;
                    int index = 0;
                    for (int yk = Math.max(0, y1 - 1); yk >= 0 && yk <= m && index < 3; yk++) {
                        flag = true;
                        for (int k = Math.min(x1, x2) + 1; k < Math.max(x1, x2); k++) {
                            if (matrix[k][yk] != ' ' && matrix[k][yk] != '.') {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            break;
                        }
                        index++;
                    }
                    if (flag) {
                        if (matrix[x1][y1] == matrix[x2][y2]) {
                            result.add("YES");
                            matrix[x1][y1] = ' ';
                            matrix[x2][y2] = ' ';
                        } else {
                            result.add("NO");
                        }
                    } else {
                        result.add("NO");
                    }
                }
            }
        }
        for (String str : result) {
            System.out.println(str);
        }
    }
}
