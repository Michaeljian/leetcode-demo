package com.zhoujian.solutions.didi;

import com.zhoujian.solutions.dataStructure.array.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhoujian123@hotmail.com 2018/8/19 20:08
 * https://www.nowcoder.com/questionTerminal/d2cced737eb54a3aa550f53bb3cc19d0?commentTags=Java
 */
public class ShareTable {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            //把每桌的容量放到数组a中
            int[] a = new int[n];
            //创建一个m行2列的二维数组，存放人数和预计消费金额
            int[][] bc = new int[m][2];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
        }

    }
}
