package com.zhoujian.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhoujian123@hotmail.com 2018/8/12 11:24
 */
public class DicOrder {


    public static List<Integer> lexicalOrder(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int curr = 1;
        for (int i = 1; i <=n ; i++) {
            list.add(curr);
            if (curr*10 <=n) {
                curr*=10;
            }else if (curr%10!=9&&curr+1<=n){
                curr++;
            }else {
                while ((curr/10)%10 ==9){
                    curr/=10;
                }
                curr = curr/10+1;
            }
        }

        return list;
    }


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList = lexicalOrder(13);
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 2) {
                System.out.println(arrayList.get(1));
            }

        }
    }
}
