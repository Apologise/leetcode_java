package com.leetcode;

public class Solution258 {
	public static int addDigits(int num){
		if( num ==0)return 0;
		int result = num%9;
		return result == 0? 9 : result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(18));
		
	}

}
