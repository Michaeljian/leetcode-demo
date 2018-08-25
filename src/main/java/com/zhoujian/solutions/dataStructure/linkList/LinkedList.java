package com.zhoujian.solutions.dataStructure.linkList;

/**
 * @author zhoujian123@hotmail.com 2018/8/18 13:02
 */
public class LinkedList {
    //定义一个头节点
    public static ListNode head;
    //节点数据类型
    public static class ListNode{
        public   int data;
        public ListNode next;
        //构造器
        public ListNode(int data){
            this.data =data;
        }
    }

}
