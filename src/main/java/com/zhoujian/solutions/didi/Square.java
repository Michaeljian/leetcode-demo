package com.zhoujian.solutions.didi;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author zhoujian123@hotmail.com 2018/8/26 16:40
 * 计算R的n次方
 */
public class Square {

    public static void main(String[] args) {
        String r;
        int n;
        String s;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            r = sc.next();
            n = sc.nextInt();
            BigDecimal d = new BigDecimal(r);
            BigDecimal ans = new BigDecimal(r);
            for(int i=1;i<n;i++){
                ans = ans.multiply(d);
            }
            s= ans.stripTrailingZeros().toPlainString();
            System.out.println(s);
        }

    }
}
