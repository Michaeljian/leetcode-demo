package com.zhoujian.solutions.dataStructure.graph;

import java.util.LinkedList;

/**
 * @author zhoujian123@hotmail.com 2018/4/26 10:39
 * 图的抽象类
 * http://opendatastructures.org/ods-java/12_1_AdjacencyMatrix_Repres.html
 */
public class Node {

    //使用邻接矩阵来存储图

    int n;
    boolean[][] a;
    Node(int n){
        this.n=n;
        a = new boolean[n][n];
    }
    void addEdge(int i, int j) {
        a[i][j] = true;
    }
    void removeEdge(int i, int j) {
        a[i][j] = false;
    }
    boolean hasEdge(int i, int j) {
        return a[i][j];
    }

}
