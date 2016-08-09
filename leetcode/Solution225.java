package com.leetcode;

import java.util.*;

//��������ʵ��ջ�Ĺ���
public class Solution225 {
	//��ջ�Ļ���һ����������top����
	private int top;
	//ͬ����˼�룬������Ҫ��2����������Ϊ�������
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	// Push element x onto stack.
	//��һ��Ԫ�ط���ջ��,ֱ�ӽ�Ԫ�ط���q1��
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    // Removes the element on top of the stack.
    //���Ƚ����ж���һ�µ�Ԫ�ض���ջ������q2�У�Ȼ���ڽ�q1��Ψһ��һ��Ԫ�س���
    public void pop() {
        //�����ж�q1��Ԫ�صĸ����Ƿ����2,�������2�ͽ���Ԫ��һ�µ�Ԫ��ת�Ƶ�q2�У���q1��Ψһ��Ԫ�س�����
    	while( q1.size() >1){
    		//q2.add(q1.remove());
    		top = q1.remove();
    		q2.add(top);
    		//������Է���top()����
    	}
    	//�Ƴ�q1�����һ��Ԫ��
    	q1.remove();
    	//����q1��q2
    	Queue<Integer> temp = q1;
    	q1 = q2;
    	q2 = temp;
    }

    // Get the top element.
    //ȡջ��Ԫ�ص�ֵ�����ҵ��������������Ԫ��
    public int top() {
        return top; 	
    }

    // Return whether the stack is empty.
    public boolean empty() {
        //ֱ���ж�q1�Ƿ�Ϊ�գ���Ϊq2ֻ��һ������ջ����ÿ������������ɺ󶼽�q2����ˣ�����q2Ϊ��
    	return q1.isEmpty();
    }
}
