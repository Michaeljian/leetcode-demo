package com.zhoujian.solutions.didi;

import java.util.Scanner;

/**
 * @author zhoujian123@hotmail.com 2018/8/19 15:23
 */
public class MaxSum {

    public static int MaxConSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int cur = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (cur >= 0) {
                cur += nums[i];
            }else {
                cur=nums[i];
            }
            if (cur > max)
                max=cur;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line2 = sc.nextLine();
        int n = Integer.parseInt(line2);
        String line = sc.nextLine();
        String[] split = line.split(" ");
        int[] nums = new int[n+1];
        for (int i = 0; i < split.length; i++) {
            nums[i]=Integer.parseInt(split[i]);
        }
        int sum = MaxConSum(nums);
        System.out.println(sum);


    }

}
