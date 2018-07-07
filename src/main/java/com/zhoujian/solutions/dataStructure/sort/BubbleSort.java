package com.zhoujian.solutions.dataStructure.sort;

import com.zhoujian.solutions.dataStructure.PrintArray;

/**
 * @author zhoujian123@hotmail.com 2018/7/7 20:07
 * 冒泡排序：假设待排序的表长为n，从后往前（或从前往后）两两比较相邻的元素的值，
 * 若为逆序A[i-1]>A[i](也就是前面值大于后面的值，则交换他们的顺序)，把最小的元素放在最前面，
 * 下次就不需要比较最小的元素了
 *
 * 平均时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 排序稳定
 */
public class BubbleSort {

    void bubbleSort(int arr[],int n){
        for (int i = 0; i <n ; i++) {
            //从后往前比较
            for (int j = n-1; j>i; j--) {
                if (arr[j-1]>arr[j]) {
                    int temp;
                    //交换两者的顺序
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {49,38,65,97,76,13,27,49};
        int n=arr.length;
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr,n);
        PrintArray.printArry(arr);
    }
}
