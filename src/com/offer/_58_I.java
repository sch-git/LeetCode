package com.offer;

/**
 * @Solution:
 * @Title: 翻转单词顺序
 * @Description: 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: chenghao.su
 * @Date: 2020/3/8 14:06
 */
public class _58_I {
    public static void main(String[] args) {
        reverseWords("a good   example");
    }

    public static String reverseWords(String s) {
        if (s.replaceAll(" ", "").length() <= 0) {
            return "";
        }
        String[] sL = s.split(" ");
        sL.toString();
        StringBuffer buffer = new StringBuffer();
        for (int i = sL.length - 1; i >= 0; i--) {
            buffer.append(sL[i]);
            if (sL[i].length() > 0) {
                buffer.append(" ");
            }
        }

        return buffer.toString().substring(0, buffer.length() - 1);
    }
}
