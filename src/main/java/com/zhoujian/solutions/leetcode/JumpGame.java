package com.zhoujian.solutions.leetcode;

/**
 * @author zhoujian123@hotmail.com 2018/8/15 15:53
 */
public class JumpGame {

    public static int jump(int [] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        //代表跳了几次
        int jump = 0;
        int cur = 0;
        int next = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cur < i){
                jump++;
                cur = next;
            }
            next = Math.max(next,i+arr[i]);
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] arr={3,2,3,1,1,4};
        int i = jump(arr);
        System.out.println(i);
    }
}
