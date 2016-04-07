package org.bugkillers.algorithm.string;

import java.util.Stack;

/**
 * Created by liuxinyu on 16/4/6.
 */
public class StringReversal {

    /**
     * 通过栈
     *
     * @param source
     * @return
     */
    public static String reverse01(String source) {
        char[] chars = source.toCharArray();

        Stack<Character> stack = new Stack<Character>();


        for (char ch : chars) {
            stack.push(ch);
        }

        String target = "";
        while (!stack.isEmpty()) {
            target += stack.pop();
        }

        return target;

    }


    /**
     * 通过异或
     *
     * @param source
     * @return
     */
    public static String reverse02(String source) {
        char[] chars = source.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            chars[start] ^= chars[end];
            chars[end] ^= chars[start];
            chars[start] ^= chars[end];
            start++;
            end--;
        }

        return new String(chars);
    }

    /**
     * 通过StringBuffer
     *
     * @param source
     * @return
     */
    public static String reverse03(String source) {
        return new StringBuffer(source).reverse().toString();
    }

    /**
     * 通过递归
     *
     * @param source
     * @return
     */
    public static String reverse04(String source) {

        int length = source.length();

        if (length <= 1) {
            return source;
        }

        String left = source.substring(0, length / 2);
        String right = source.substring(length / 2, length);

        return reverse04(right) + reverse04(left);
    }


    /**
     * 使用string charAt
     *
     * @param source
     * @return
     */
    public static String reverse05(String source) {
        int length = source.length();
        String reverse = "";
        for (int i = 0; i < length; i++) {
            reverse = source.charAt(i) + reverse;
        }
        return reverse;
    }

    /**
     * 使用for循环
     *
     * @param source
     * @return
     */
    public static String reverse06(String source) {
        char[] array = source.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--)
            reverse += array[i];

        return reverse;
    }

    /**
     * 二分法
     *
     * @param source
     * @return
     */
    public static String reverse07(String source) {
        char[] s = source.toCharArray();
        int n = s.length - 1;
        int halfLength = n / 2;
        for (int i = 0; i <= halfLength; i++) {
            char temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }
        return new String(s);
    }


    public static void main(String[] args) {
        String source = "hello world";
        System.out.println(reverse01(source));
        System.out.println(reverse02(source));
        System.out.println(reverse03(source));
        System.out.println(reverse04(source));
        System.out.println(reverse05(source));
        System.out.println(reverse06(source));
        System.out.println(reverse07(source));
    }

}
