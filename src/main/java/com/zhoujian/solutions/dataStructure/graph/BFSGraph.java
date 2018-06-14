package com.zhoujian.solutions.dataStructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zhoujian123@hotmail.com 2018/4/26 10:28
 * 图的广度优先遍历----借助队列
 * 图是用邻接表来表示的
 *
 *
 */
public class BFSGraph {

    private int V;   // 顶点的个数
    private LinkedList<Integer> adj[]; //邻接表表示

    // 构造器，用于构造出来一个邻接表
    BFSGraph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // 加入一条边--在列表中指定的位置插入指定的元素
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }


    // 给定一个顶点值，打印出从此值的广度优先遍历
    void BFS(int s)
    {
        //辅助数组visited[]标志顶点是否被访问过，它的初始状态为FALSE
        boolean visited[] = new boolean[V];

        // 创建一个队列
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // 将当前节点标记为true并且入队
        visited[s]=true;
        queue.add(s);


        while (queue.size() != 0)
        {
            // 如果队列不为空，则获取并移除队头元素
            s = queue.poll();
            System.out.print(s+" ");

            //返回此列表中的元素迭代器
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    //如果没有被访问，则加入到队列中
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to
    public static void main(String args[])
    {
        BFSGraph g = new BFSGraph(7);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 6);

        System.out.println("以下是广度优先遍历 "+ "(从顶点二开始 2)");
        //从指定顶点进行广度优先遍历
        g.BFS(1);
    }

}
