package com.zhoujian.solutions.dataStructure.graph;

import java.util.*;

/**
 * @author zhoujian123@hotmail.com 2018/4/26 10:28
 * 图的广度优先遍历----借助队列
 * 图是用邻接表来存储（对于稀疏图来说，邻接表比较合适）
 * 时间复杂度：O(V+E)，其中V是图中顶点的数量，E是图中边的数量
 */
public class BreadthFirstSerch {

    private int V; //顶点
    private LinkedList<Integer> adj[]; //领接表

    //构造器
    BreadthFirstSerch(int v){
        V=v;
        adj = new LinkedList[v];
        for (int i = 0; i <v; i++) {
            adj[i]=new LinkedList();
        }
    }

    //加入一条边到图中
    void addEdge(int v,int w){
        adj[v].add(w);
    }

    //从给定的顶点开始遍历
    void BFS(int s){

        //默认将所有的顶点设置为未被访问（false）
        boolean visited[] = new boolean[V];
        //创建一个队列
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //把当前顶点设置为已访问并且入队
        visited[s] = true;
        queue.add(s);

        while (queue.size()!=0){

            //出队并打印出来
            s=queue.poll();
            System.out.println(s+"");

            //获取全部的顶点并出队，如果邻接的点未被访问，则设置为已被访问且入队
            ListIterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }

        }

    }

    public static void main(String[] args) {
        BreadthFirstSerch g = new BreadthFirstSerch(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        //这个函数只能从指定顶点开始遍历。要是打印所有顶点，可以需要修改BFS函数，逐个从所有节点开始遍历
        System.out.println("广度优先遍历从0开始遍历");
        g.BFS(0);
        System.out.println("广度优先遍历从1开始遍历");
        g.BFS(1);
        System.out.println("广度优先遍历从2开始遍历");
        g.BFS(2);
        System.out.println("广度优先遍历从3开始遍历");
        g.BFS(3);
    }


}
