package com.zhoujian.solutions.dataStructure.graph;

import java.util.LinkedList;

/**
 * @author zhoujian123@hotmail.com 2018/4/26 10:39
 * 图的抽象类
 */
public class Graph {


    /**
     * 邻接表表示
     */
    private int V;  //顶点
    private LinkedList<Integer> adj[]; //相邻

    //构造器
    Graph(int v){
        V=v;
        adj = new LinkedList[v];
        for (int i = 0; i <v ; i++) {
            adj[i] = new LinkedList();
        }
    }

    //构造出边
    void addEdge(int v, int w){
        adj[v].add(w);
    }

}
