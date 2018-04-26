package com.zhoujian.solutions.dataStructure.graph;

import java.util.LinkedList;

/**
 * @author zhoujian123@hotmail.com 2018/4/26 10:28
 * 图的广度优先遍历
 *
 */
public class BreadthFirstSearch {


    public static void BFS(int s){

        //设置所有的顶点是否被访问过，它的厨师状态为false
        boolean[] visited = new boolean[V];

        //创建一个队列
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //标记当前节点已被访问，并且入队
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0){

            //让顶点出队然后打印出来
            s = queue.poll();
            System.out.println(s+"");


        }
    }
}
