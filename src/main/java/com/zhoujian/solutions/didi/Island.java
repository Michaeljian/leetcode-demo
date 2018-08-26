package com.zhoujian.solutions.didi;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author zhoujian123@hotmail.com 2018/8/26 17:07
 */
public class Island {

    static int m;
    static int n;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int k = sc.nextInt();
        int[][] nums = new int[m][n];
        for (int i = 0; i < k; i++) {
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            nums[i1][i2] = 1;
        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println(nums[i][j]);
//            }
//        }
        LinkedList<Integer> linkedList = findIsland(nums, m, n);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


    }

    private static LinkedList<Integer> findIsland(int[][] nums, int m, int n) {
        int count = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 1) {
                    DFSMarking(nums, i, j);
                    ++count;
                    list.add(count);
                }
            }
        }
        return list;
    }

    private static void DFSMarking(int[][] nums, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || nums[i][j] != 1) {
            return;
        }
        nums[i][j] = 0;
        DFSMarking(nums, i + 1, j);
        DFSMarking(nums, i - 1, j);
        DFSMarking(nums, i, j + 1);
        DFSMarking(nums, i, j - 1);
    }

}
