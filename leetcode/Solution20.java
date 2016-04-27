package com.leetcode;

import java.util.Stack;

public class Solution20 {
	public static boolean isValid(String s){
		Stack <Character> stack = new Stack<Character>();
		for(int i = 0; i< s.length(); i++){
			if(s.charAt(i)=='(' ||s.charAt(i)=='[' ||s.charAt(i)=='{' ){
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() =='(' ){
				stack.pop();
			}
			else if( s.charAt(i) == ']' && !stack.empty() && stack.peek() =='[' ){
				stack.pop();
			}
			else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() =='{'){
				stack.pop();
			}
		}
		return stack.empty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "qwer()dfsg{[]}";
		System.out.println(Solution20.isValid(s));
	}
}
