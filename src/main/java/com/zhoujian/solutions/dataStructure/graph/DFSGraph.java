package com.zhoujian.solutions.dataStructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zhoujian123@hotmail.com 2018/4/25 21:19
 * 图的深度优先遍历：需要借助栈
 * 1、栈初始化
 * 2、输出起始顶点，起始顶点改为“已访问”标志，将起始顶点进栈
 * 3、重复下列操作直到栈为空：
 *      3.1、取栈顶元素顶点；（注意不出栈）
 *      3.2、栈顶元素顶点存在未被访问过的邻接点w，则
 *          3.2.1、输出顶点w
 *          3.2.2、将顶点w改为“已访问”标志；
 *          3.2.3、将顶点w进栈
 *      3.3、否则，当前顶点退栈
 *
 */
public class DFSGraph {

    //顶点个数
    private int V;
    //邻接表表示
    private LinkedList<Integer> adj[];

    // 构造一个邻接表
    DFSGraph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //加入边
    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
    }

    //深度优先遍历
    void DFSUtil(int v,boolean visited[])
    {
        // 把当前节点标记为true
        visited[v] = true;
        System.out.print(v+" ");

        //返回此列表中的元素迭代器
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // 深度优先遍历
    void DFS(int v)
    {
        //初始化标记，默认为FALSE
        boolean visited[] = new boolean[V];
        //递归调用
        DFSUtil(v, visited);
    }

    public static void main(String args[])
    {
        DFSGraph g = new DFSGraph(4);

        //构造出一个有向图
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("深度优先遍历 "+
                "(从顶点2开始遍历)");

        g.DFS(2);
    }




}
