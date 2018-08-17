package com.zhoujian.solutions.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhoujian123@hotmail.com 2018/8/17 10:01
 */
public class AllPermutation {

    public static List<List<Integer>> permute(int[] num){
        ArrayList<List<Integer>> listArrayList = new ArrayList<List<Integer>>();
        permute(listArrayList,num,0);
        return listArrayList;
    }

    private static void permute(ArrayList<List<Integer>> arrayList, int[] array, int start) {
        if (start >= array.length) {
            ArrayList<Integer> current = new ArrayList<Integer>();
            for (int a:array) {
                current.add(a);
            }
            arrayList.add(current);
        }else {
            for (int i = start; i <array.length ; i++) {
                swap(array,start,i);
                permute(arrayList,array,start+1);
                swap(array,start,i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        List<List<Integer>> lists = permute(nums);
        System.out.println(lists);
    }
}
