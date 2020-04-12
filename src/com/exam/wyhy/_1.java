package com.exam.wyhy;

/**
 * @Description: 9进制加法
 * @Author: chenghao.su
 * @Date: 2020/4/11 19:06
 */
public class _1 {
    private static int j = 0;

    public static void main(String[] args) {
        System.out.println(add("1.28", "1.71"));
    }

    public static String add(String num1, String num2) {
        // write code here
        String[] nums1 = num1.split("\\.");
        String[] nums2 = num2.split("\\.");
        String num1_z = nums1[0];
        String num1_s = nums1[1];
        String num2_z = nums2[0];
        String num2_s = nums2[1];
        String sum_s = add2(num1_s, num2_s);
        String sum_z = add1(num1_z, num2_z);
        String result = "";
        if (j > 0) {
            result = j + sum_z;
        } else {
            result = sum_z;
        }
        if (sum_s.length() > 0) {
            result += "." + sum_s;
        }
        return result;
    }

    public static String add1(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        StringBuffer buffer = new StringBuffer();
        for (; index1 >= 0 && index2 >= 0; index1--, index2--) {
            int now1 = Integer.parseInt(String.valueOf(num1.charAt(index1)));
            int now2 = Integer.parseInt(String.valueOf(num2.charAt(index2)));
            int sum = now1 + now2;
            if (j > 0) {
                sum += j;
                j = 0;
            }
            if (sum > 9) {
                j = sum / 9;
                sum = sum % 9;
            }
            buffer.append(sum);
        }
        for (; index1 >= 0; index1--) {
            int sum = Integer.parseInt(String.valueOf(num1.charAt(index1)));
            if (j > 0) {
                sum += j;
                j = 0;
            }
            if (sum > 9) {
                j = sum / 9;
                sum = sum % 9;
            }
            buffer.append(sum);
        }
        for (; index2 >= 0; index2--) {
            int sum = Integer.parseInt(String.valueOf(num2.charAt(index2)));
            if (j > 0) {
                sum += j;
                j = 0;
            }
            if (sum >= 9) {
                j = sum / 9;
                sum = sum % 9;
            }
            buffer.append(sum);
        }
        return buffer.reverse().toString();
    }

    public static String add2(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        StringBuffer buffer = new StringBuffer();
        for (int i = Math.min(index1, index2); i >= 0; i--) {
            int now1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int now2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
            int sum = now1 + now2;
            if (j > 0) {
                sum += j;
                j = 0;
            }
            if (sum >= 9) {
                j = sum / 9;
                sum = sum % 9;
            }
            buffer.append(sum);
        }
        if (index1 == index2) {
            return buffer.reverse().toString();
        } else if (index1 < index2) {
            return buffer.reverse().toString() + num2.substring(index1 + 1);
        } else {
            return buffer.reverse().toString() + num1.substring(index2 + 1);
        }
    }
}
