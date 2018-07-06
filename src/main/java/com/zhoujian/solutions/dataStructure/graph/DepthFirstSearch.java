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
public class DepthFirstSearch {



}
