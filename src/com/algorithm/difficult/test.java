package com.algorithm.difficult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Description: TODO
 * @Author: chenghao.su
 * @Date: 2020/2/11 17:44
 */
public class test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName(1);
        user1.setCore(1);
        User user2 = new User();
        user2.setName(2);
        user2.setCore(2);
        User user3 = new User();
        user3.setName(1);
        user3.setCore(3);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.name > o2.name) {
                    return 1;
                } else if (o1.name < o2.name) {
                    return -1;
                } else {
                    if (o1.core > o2.core) {
                        return 1;
                    } else if (o1.core < o2.core) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getCore());
        }
    }
}

class User implements Comparable<User> {
    int name;
    int core;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    @Override
    public int compareTo(User o) {
        if (this.name > o.name) {
            return 1;
        } else if (this.name < o.name) {
            return -1;
        } else {
            if (this.core > o.core) {
                return 1;
            } else if (this.core < o.core) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
