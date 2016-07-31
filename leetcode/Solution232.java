package com.leetcode;

import java.util.*;

/*ջ�Ĺ������Ƚ���������еĹ������Ƚ��ȳ�
 * push(): ���ԣ����Ҫ��һ��Ԫ�ؽ�ջ����ô����Ҫ������һ��ջ��Ԫ�ط��뵽���еġ�
 * ջ��Ȼ�����Ԫ�ط������е�ջ��
 * pop(): ��ջ��Ŀ���ǽ����е���ջԪ������ײ��Ԫ��ȡ����������ջ�����ԣ�ֻ�ܴӶ���ȡ������
 * ��Ҫһ�������ջ�������ЩԪ�ء�
 * 
 * peek():�鿴���ȷ����Ԫ�ص����ݣ�һ�����ȷ��������ջ�У������ջ��Ϊ�գ���ô��ȡ
 * ��ջ�����Ԫ�ء�
 * 
 * 
 * empty():���2������ջ��Ԫ�ض�Ϊ�գ���ô�������ҲΪ��
 * */
//ʹ��ջ��ʵ�ֶӵ���ع���
public class Solution232 {
	//ʹ��2��ջ��һ����ջ����һ����ջ
	Stack<Integer> prime = new Stack<Integer>();//��ջ
	Stack<Integer> secondary = new Stack<Integer>();//��ջ
	 // Push element x to the back of queue.
	//���Ӳ���
    public void push(int x) {
        //���������ջ��λ�գ���ô�Ƚ���ջ��Ԫ�ؽ�ջ����Ϊ�ڳ�ջ�����У�
    	//���ǻὫ��ջ��Ԫ��ת�Ƶ���ջ�У����Ը�ջ�е�Ԫ��Ӧ���ڵ�ǰҪ
    	//Ҫ�����Ԫ�ص�ǰ��
    	while( !secondary.isEmpty() ){
    		prime.push(secondary.pop());
    	}
    	prime.push(x);
    }

    // Removes the element from in front of queue.
    //�����У���ô���������ȷ�����Ǹ�Ԫ�أ��������primeջ���գ���ô
    //��ôpop()�Ĺ��ܾ���ȡ��primeջ�͵�Ԫ��(��ʱ���ǿ��Խ�prime�е�Ԫ��
    //ȫ�����뵽secondary�У�Ȼ����ֱ��ȡ��ջ����Ԫ��
    //)�����primeΪ�գ���ô����ȡ��
    //secondary��ջ�׵�Ԫ��
    public void pop() {
        while( !prime.isEmpty() ){
        	secondary.push(prime.pop());
        }
        secondary.pop();
    }

    // Get the front element.
    //�鿴ջ����Ԫ��
    public int peek() {
        //�鿴���ȷ����Ԫ�أ���prime��ջ��Ԫ��
    	//�������ǿ����Ƚ�prime�е�Ԫ��ȫ�����뵽secondary�У�Ȼ����ȡ��ջ����Ԫ��
    	while( !prime.isEmpty() ){
    		secondary.push(prime.pop());
    	}
    	//ע�⣬���ﲻ����pop(),��ΪpeekԪ���ǲ鿴����Ԫ�أ���������ı�ӵ�Ԫ��
    	//����pop���ı���׵�Ԫ��
    	// return secondary.pop(); //Error
    	return secondary.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        //����ջ��Ϊ�ձ�ʾ�������Ϊ��
    	return prime.isEmpty()&&secondary.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
