package com.zhoujian.solutions.dataStructure.search;

/**
 * @author zhoujian123@hotmail.com 2018/7/6 15:07
 *  二分查找算法（折半查找）的算法思想：它仅适合有序的顺序表。基本思路是：
 *  1.首先将给定值key与表中中间位置的元素mid值进行比较；
 *  2.若相等，则返回该元素的位置；
 *  3.若key大于mid值，那么key的值会在mid值之后的值中，若key小于mid值，那么key的值会在mid之前的值中
 *
 */
public class BinarySearch {

    /**
     * 二分查找算法
     * @param arr 输入一组数字序列，它已经是顺序排列
     * @param key 要查找的关键字
     */
    int binarySearch(int arr[],int key){

        //若存在返回其位置，不存在则放回-1
        if(arr.length <= 0 ){
            return -1;
        }

        //定义字符串的首和尾，中间值
        int low = 0,high = arr.length,mid;

        //计算比较的次数
        int count= 0;
        while(low <= high){
            count++;
            mid = (low+high)/2;
            if (key == arr[mid])
                return mid;
            else if (key > arr[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }

        }
        System.out.println("比较的次数为"+count);
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {7,10,13,16,19,29,32,33,37,41,43};
        BinarySearch search = new BinarySearch();
        int i = search.binarySearch(arr, 11);
        System.out.println("i的值为"+i);

    }
}
