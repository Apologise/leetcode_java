package com.leetcode;

public class Solution326 {
	public boolean isPowerOfThree(int n){
		if(n > 0){
			while( n%3 == 0) n /= 3;
		}
		return n==1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
