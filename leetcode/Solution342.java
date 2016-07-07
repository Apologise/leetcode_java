package com.leetcode;

public class Solution342 {
	public boolean isPowerOfFour(int num){
		if(num <= 0) return false;
		while(num%4==0) num /=4;
		return num==1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
