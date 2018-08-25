package com.zhoujian.solutions.leetcode;

import com.zhoujian.solutions.dataStructure.linkList.LinkedList;

/**
 * @author zhoujian123@hotmail.com 2018/8/18 12:59
 */
public class removeNthFromEnd {

    /**
     * 删除链表的倒数第N个节点
     * @param head 链表的头结点
     * @param n 倒数的第n个节点
     * @return
     */
    public static LinkedList.ListNode removeEnd(LinkedList.ListNode head, int n){
        //初始化一个单链表
        LinkedList.ListNode node = new LinkedList.ListNode(0);
        //链表的next指针开始执行头结点
        node.next = head;
        int length = 0;
        LinkedList.ListNode first = head;
        while (first!= null){
            length++;
            first = first.next;
        }
        System.out.println("链表长度为："+length);
        //设置一个指向头结点的指针，并移动它遍历列表
        //直到它到达第(L-n)个节点哪里
        length -= n;
        first = node;
        while (length>0){
            length --;
            first = first.next;
        }
        //然后把第(L-n)个节点的next指针重新链接到第(L-n+2)个节点
        first.next =first.next.next;

        //返回一个头指针
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.ListNode(1);
        list.head.next = new LinkedList.ListNode(2);
        list.head.next.next = new LinkedList.ListNode(3);
        list.head.next.next.next = new LinkedList.ListNode(4);
        list.head.next.next.next.next = new LinkedList.ListNode(5);
        LinkedList.ListNode head = removeEnd(list.head, 2);
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}



