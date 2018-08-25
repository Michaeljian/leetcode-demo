package com.zhoujian.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zhoujian123@hotmail.com 2018/8/17 15:35
 */
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<Integer>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<Integer>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3};
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(" ");
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        Permutation permutation = new Permutation();
        List<List<Integer>> listList = permutation.permute(nums);
        System.out.println(listList);
    }
}
