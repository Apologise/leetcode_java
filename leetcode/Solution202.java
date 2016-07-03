package com.leetcode;

public class Solution202 {
	public int cal(int n){
		int s = 0;
		int x = n;
		while(n>0){
			s += (n%10)*(n%10);
			n /= 10;
		}
		return s;
	}
	
	public boolean isHappyNumber(int n){
		int x = n;
		int y = n;
		while( x > 1){
			x = cal(x);
			if(x == 1) return true;
			y = cal(cal(y));
			if(y == 1) return true;
			
			if(x == y )return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
