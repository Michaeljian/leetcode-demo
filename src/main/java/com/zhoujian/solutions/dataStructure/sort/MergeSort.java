package com.zhoujian.solutions.dataStructure.sort;

/**
 * @author zhoujian123@hotmail.com 2018/5/7 10:08
 *
 * 归并排序的算法思想：它是将待排列的元素分成大小大致相同的两个子集合，并分别对两个子集合排序，然后将排好的子集合合并。
 * https://www.geeksforgeeks.org/merge-sort/
 *
 * 空间复杂度：O(n)
 * 稳定：是的
 * 时间复杂度： O(nlogn)
 * 根据递推式画出递推公式
 * T（n）= 2T（n / 2）+ C(n)
 *
 */
public class MergeSort {

    /**
     * merge()函数的功能是将前后相邻的两个有序表归并为一个有序表的算法。
     * @param arr
     * @param l
     * @param m
     * @param r
     */
    public static void merge(int arr[],int l,int m,int r){

        //计算出子数组的长度
        int n1 = m - l + 1;
        int n2 = r - m;


        //建立临时数组存放左右子数组
        int L[] = new int [n1];
        int R[] = new int [n2];

        //将子数组的值复制到临时数组中
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    /**
     * 归并排序:将一个数组分为两个
     * @param arr 数组
     * @param l 数组的首地址
     * @param r 数组的尾地址
     */
    public static void sort(int arr[],int l,int r){

        if (l < r) {
            //取得数组的中点位置的索引
            int m = (l+r)/2;  //向上取整，大于这个数的最小正整数
            //递归调用，将子串大小分隔为1
            sort(arr, l ,m );
            sort(arr,m+1,r);
            //合并两个有序表
            merge(arr,l,m,r);
        }
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {38,27,43,3,9,82,10};
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.sort(arr,0,arr.length-1);
        printArray(arr);
    }
}
