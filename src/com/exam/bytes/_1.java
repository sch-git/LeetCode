package com.exam.bytes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @Author: chenghao.su
 * @Date: 2020/3/15 20:19
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<User> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            String[] str = in.nextLine().split(" ");
            User user = new User(str);
            list.add(user);
        }

    }

    static class User implements Comparator<User> {
        String type;
        String model;

        public User(String[] str) {
            this.type = str[0];
            this.model = str[1];
        }

        @Override
        public int compare(User o1, User o2) {

            return 0;
        }
    }
}
