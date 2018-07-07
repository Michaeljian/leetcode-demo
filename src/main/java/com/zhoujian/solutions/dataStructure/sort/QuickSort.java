package com.zhoujian.solutions.dataStructure.sort;

import com.zhoujian.solutions.dataStructure.PrintArray;

/**
 * @author zhoujian123@hotmail.com 2018/4/30 17:47
 *
 * quickSort中关键过程是partition()，分区的目标是给定一个数组和一个数组的元素x作为枢轴,
 * 将表中比枢轴值大的元素向右移动，比枢轴值小的元素向左移动，使得一趟Partition()操作之后，表中的元素被枢轴值一份为二
 *
 * 递归表达式：T（n）= T（k）+ T（nk-1）+C(n)
 * 前两项用于两次递归调用，最后一项用于分区过程。QuickSort花费的时间取决于输入阵列和分区策略。
 *
 * 最坏情况： 最坏的情况发生在分区过程总是选择最大或最小的元素作为关键点时。如果我们考虑上面的分区策略，其中最后一个元素总是被选为主点，
 *
 * 那么最坏的情况会发生在数组已按升序或降序排序的情况下。以下是最坏情况下的复发。
 * T（n）= T（0）+ T（n-1）+ \ C（n）
 * 相当于
 * T（n）= T（n-1）+ \ C（n）
 * 上述复发的解决方案是O（n^2）。
 *
 * 最好的情况： 最好的情况发生在分区过程总是选择中间元素作为枢轴。以下是最佳情况的复发。
 *
 * T（n）= 2T（n / 2）+ \ C（n）
 *
 * 上述复发的解决方案是O（nLogn）。它可以使用主定理的情况2来解决
 * 平均情况时间复杂度：O(nlogn)
 *
 * 平均空间复杂度：O(logn)
 * 不稳定：快速排序是一个不稳定的排序算法
 */
public class QuickSort {

    /**
     * 分区函数
     * @param arr 输入的字符序列
     * @param low 左指针
     * @param high 右指针
     * @return 返回枢轴存放的最终位置
     */
    int partition(int arr[],int low,int high){

        //一般选择第一个元素作为枢轴
        int pivat = arr[low];

        while (low<high){
            while (low<high&&arr[high]>=pivat) --high;
            //否则将比枢轴值小的元素移动到左端
            arr[low]=arr[high];
            while (low<high&&arr[low]<=pivat) ++low;
            //否则比枢轴值大的元素移动到右端
            arr[high]=arr[low];
        }
        //枢轴值存放的最终位置，可以利用low和high来表示
        arr[low]=pivat;
        return low;
    }

    void quicksort(int arr[],int low,int high){
        if ( low<high) {
            //划分区间
            int partition = partition(arr, low, high);
            quicksort(arr,low,partition-1);
            quicksort(arr,partition+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[]={49,38,65,97,76,13,27,49};
        int low =0;
        int high=arr.length-1;
        QuickSort quickSort = new QuickSort();
        quickSort.quicksort(arr,low,high);
        PrintArray.printArry(arr);

    }

}

