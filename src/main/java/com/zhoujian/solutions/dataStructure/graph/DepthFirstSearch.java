package com.zhoujian.solutions.dataStructure.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author zhoujian123@hotmail.com 2018/4/25 21:19
 * 图的深度优先遍历：需要借助栈
 * 深度优先遍历类似于二叉树的先序遍历
 * 使用邻接表表示
 * 时间复杂度：当以领接表表示时，查找所有顶点的邻接点所需
 *
 *
 */
public class DepthFirstSearch {

    //顶点的数量
    private int V;
    //邻接表-数组类型的链表
    private LinkedList<Integer> adj[];

    //构造一个图
    DepthFirstSearch(int  v){
        V = v;
        //数组链表
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i]=new LinkedList();
        }
    }

    //加入与顶点v相连的边v-w
    void addEdge(int v,int w){
        adj[v].add(w);
    }

    /**
     * 从顶点v开始深度遍历
     * @param v 顶点v
     * @param visited 访问标识符
     */
    void DFSUtil(int v,boolean visited[]){

        //把当前节点设置为被访问并打印出来
        visited[v]=true;
        System.out.println(v+" ");

        ListIterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            //返回与v相邻的节点
            Integer n = i.next();
            if (!visited[n]){
                DFSUtil(n,visited);
            }
        }

    }

    void DFS(int v){

        //初始化所有顶点并默认为false（数组）
        boolean[] visited = new boolean[V];
        DFSUtil(v,visited);
    }


    public static void main(String[] args) {

        DepthFirstSearch g = new DepthFirstSearch(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        System.out.println("深度优先遍历从顶点2开始");
        g.DFS(2);

    }

}
