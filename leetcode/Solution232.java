package com.leetcode;

import java.util.*;

/*栈的功能是先进后出，队列的功能是先进先出
 * push(): 所以，如果要将一个元素进栈，那么首先要将另外一个栈的元素放入到现有的、
 * 栈，然后将这个元素放入现有的栈中
 * pop(): 出栈：目的是将现有的主栈元素中最底层的元素取出来。按照栈的特性，只能从顶部取，所以
 * 需要一个缓冲的栈来存放这些元素。
 * 
 * peek():查看最先放入的元素的内容，一般最先放入的在主栈中，如果副栈不为空，那么先取
 * 幅栈的最顶的元素。
 * 
 * 
 * empty():如果2个缓冲栈的元素都为空，那么这个队列也为空
 * */
//使用栈来实现队的相关功能
public class Solution232 {
	//使用2个栈，一个进栈，和一个出栈
	Stack<Integer> prime = new Stack<Integer>();//主栈
	Stack<Integer> secondary = new Stack<Integer>();//副栈
	 // Push element x to the back of queue.
	//进队操作
    public void push(int x) {
        //如果幅缓冲栈部位空，那么先将幅栈的元素进栈（因为在出栈操作中）
    	//我们会将主栈的元素转移到副栈中，所以副栈中的元素应该在当前要
    	//要放入的元素的前面
    	while( !secondary.isEmpty() ){
    		prime.push(secondary.pop());
    	}
    	prime.push(x);
    }

    // Removes the element from in front of queue.
    //出队列，那么出的是最先放入的那个元素，首先如果prime栈不空，那么
    //那么pop()的功能就是取出prime栈低的元素(此时我们可以将prime中的元素
    //全部放入到secondary中，然后在直接取出栈顶的元素
    //)，如果prime为空，那么就是取出
    //secondary的栈底的元素
    public void pop() {
        while( !prime.isEmpty() ){
        	secondary.push(prime.pop());
        }
        secondary.pop();
    }

    // Get the front element.
    //查看栈顶的元素
    public int peek() {
        //查看最先放入的元素，即prime中栈底元素
    	//所以我们可以先将prime中的元素全部放入到secondary中，然后在取出栈顶的元素
    	while( !prime.isEmpty() ){
    		secondary.push(prime.pop());
    	}
    	//注意，这里不能用pop(),因为peek元素是查看队首元素，但并不会改变队的元素
    	//而用pop则会改变队首的元素
    	// return secondary.pop(); //Error
    	return secondary.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        //两个栈都为空表示这个队列为空
    	return prime.isEmpty()&&secondary.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
