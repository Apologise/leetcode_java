package com.leetcode;

import java.util.*;

//借助队列实现栈的功能
public class Solution225 {
	//该栈的还有一个变量便是top变量
	private int top;
	//同样的思想，我们需要用2个队列来作为缓冲队列
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	// Push element x onto stack.
	//将一个元素放入栈中,直接将元素放入q1中
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    // Removes the element on top of the stack.
    //首先将队列顶端一下的元素都出栈保存在q2中，然后在将q1中唯一的一个元素出列
    public void pop() {
        //首先判断q1中元素的个数是否大于2,如果大于2就将顶元素一下的元素转移到q2中，将q1中唯一的元素出队列
    	while( q1.size() >1){
    		//q2.add(q1.remove());
    		top = q1.remove();
    		q2.add(top);
    		//这里可以方面top()函数
    	}
    	//移除q1中最后一个元素
    	q1.remove();
    	//交换q1和q2
    	Queue<Integer> temp = q1;
    	q1 = q2;
    	q2 = temp;
    }

    // Get the top element.
    //取栈顶元素的值，即找到队列中最上面的元素
    public int top() {
        return top; 	
    }

    // Return whether the stack is empty.
    public boolean empty() {
        //直接判断q1是否为空，因为q2只是一个缓冲栈，在每个函数功能完成后都将q2清空了，所以q2为空
    	return q1.isEmpty();
    }
}
