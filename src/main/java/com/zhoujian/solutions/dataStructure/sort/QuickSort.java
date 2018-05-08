package com.zhoujian.solutions.dataStructure.sort;

/**
 * @author zhoujian123@hotmail.com 2018/4/30 17:47
 *
 * quickSort中关键过程是partition()，分区的目标是给定一个数组和一个数组的元素x作为枢轴,
 * 将表中比枢轴值大的元素向右移动，比枢轴值小的元素向左移动，使得一趟Partition()操作之后，表中的元素被枢轴值一份为二
 *
 *
 *
 */
public class QuickSort {

    public int partition(int arr[],int low,int high){

        int pivot = arr[low];
        while (low < high){
            while (low < high && arr[high] >= pivot){
                //
                --high;
            }
            //将比枢轴值小的元素移动到左端
            arr[low]=arr[high];
            while (low < high && arr[low] <=pivot){
                --low;
            }
            //将比枢轴值大的元素移动到右端
            arr[high]=arr[low];
        }
        //此时low就是pivot最终的位置
        arr[low] = pivot;
        return 0;
    }
}

