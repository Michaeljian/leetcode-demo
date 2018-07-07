package com.zhoujian.solutions.dataStructure.sort;

/**
 * @author zhoujian 2018/5/6
 *
 * 直接插入排序基本思想：每次将待排序的记录，按其关键字大小插入到前面已经排好序的子序列中适当的位置，
 * 直到全部记录插入完成为止。
 *
 * 生活中的实际模型：打扑克牌叫牌的时候
 *
 * 时间复杂度： O（n * n）
 * 辅助空间： O（1）
 * 边界情况：如果元素按相反顺序排序，插入排序需要最多时间进行排序。当元素已经排序时，它需要最少的时间（n的顺序）。
 * 算法范式：增量方法
 * 排序：是的
 * 稳定：是的
 * 用途： 当元素数量较少时使用插入排序。当输入数组几乎排序时，它也可能很有用，只有很少的元素在完整的大数组中放错位置。
 *
 */
public class InsertSort {

    /**
     * 直接插入排序
     * @param arr 输入的数组
     * @param n 数组的长度
     */
    void insertSort(int arr[],int n){

        //从数组的第二个元素开始比较
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j =i-1;
            while (j>=0&&arr[j] >key){
                //往后移动
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {

        int arr[]= {49,38,65,97,76,13,27,49};
        int n = arr.length;
        InsertSort insert = new InsertSort();
        insert.insertSort(arr,n);
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}
