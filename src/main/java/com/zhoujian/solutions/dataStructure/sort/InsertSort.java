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
   辅助空间： O（1）
   边界情况：如果元素按相反顺序排序，插入排序需要最多时间进行排序。当元素已经排序时，它需要最少的时间（n的顺序）。
   算法范式：增量方法
   排序：是的
  稳定：是的
  在线：是的
用途： 当元素数量较少时使用插入排序。当输入数组几乎排序时，它也可能很有用，只有很少的元素在完整的大数组中放错位置。
 *
 */
public class InsertSort {

    //输入一串随机数，放到数组中
    public static void sort(int arr[]){

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            //从第二个开始比较
            int key = arr[i];
            int j = i-1;
            //如果要比较的值和它前面的值要小，则将这个值放到比它小的位置上去
            while (j>=0 && arr[j] > key){
                //大的值往后移
                arr[j+1]=arr[j];
                j=j-1;
            }
            //最终的要比较的那个值位置
            arr[j+1]=key;
        }
    }

    public static void printArray(int arr[]){

        int n =arr.length;
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={12,11,13,5,6};
        sort(arr);
        printArray(arr);
    }
}
