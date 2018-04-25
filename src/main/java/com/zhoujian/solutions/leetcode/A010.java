package com.zhoujian.solutions.leetcode;

/**
 * @author zhoujian123@hotmail.com 2018/4/25 16:36
 * 题目：判断一个整数是否是回文数（不能使用额外的空间）
 * 思路：利用整数的取整和取余
 * 例如：x=12321
 * x是从整数开头判断
 * rev是从结尾判断
 */
public class A010 {

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
