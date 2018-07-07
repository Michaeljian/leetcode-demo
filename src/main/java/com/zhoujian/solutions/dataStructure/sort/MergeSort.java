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

    int temp[];

    /**
     * merge()的功能是将前后相邻的两个有序表归并为一个有序表的算法。
     * @param arr
     * @param low
     * @param mid
     * @param high
     */
    void merge(int arr[],int low,int mid,int high){
        temp = new int[arr.length+1];
        //将arr中的数据复制到temp，比较temp中的值，最后将比较后的序列复制到arr中
        for (int k=low; k <=high; k++) {
            temp[k]=arr[k];
        }
        int i,j,k;
        for (i=low,j=mid+1,k=i;i<=mid&&j<=high;k++){
            if (temp[i] <=temp[j]){
                arr[k]=temp[i++];
            }else {
                arr[k]=temp[j++];
            }
        }


        //当两个序列中的一个比较完了之后，另外一个直接复制到arr的结尾处
        while (i<=mid) arr[k++]=temp[i++]; //当第一个表未检测完
        while (j<=high) arr[k++]=temp[j++]; //当第二个表未检测完
    }

    /**
     * 采用2路归并排序
     * @param arr
     * @param low
     * @param high
     */
    void mergeSort(int arr[],int low,int high ){
        if (low <high ) {
            int mid =(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            //将两个以排好序的列表进行合并
            merge(arr,low,mid,high);
        }

    }

    public static void main(String[] args) {

        int arr[]={49,28,65,97,76,13,27};
        int low = 0;
        int high = arr.length-1;
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr,low,high);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
