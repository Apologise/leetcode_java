package com.leetcode;

import java.util.Stack;

public class Solution20_1 {
	public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){st.push(s.charAt(i)); }
        		//���ջ��ʱ�Ƿ�Ϊ��,����ǿ��򷵻�false�������Ϊ����ôȡջ��Ԫ�أ����Ƿ���֮���
        	else if (!st.empty() && s.charAt(i) == ')'&&st.peek() == '(' ) {
					st.pop();
				}
        	else if (st.peek() == '[' && !st.empty() && s.charAt(i) == ']') {
					st.pop();
				}
        	else if (st.peek() == '{' && !st.empty() && s.charAt(i) == '}') {
					st.pop();
				}
        }
        return st.isEmpty();
    }
}
