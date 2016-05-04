package com.leetcode;

public class Solution70 {
	//递归实现的话会超时，并不推荐
	public static int climbStairs1(int n){
		if( n== 1 ) return 1;
		if( n == 2 ) return 2;
		return climbStairs1(n-1 ) + climbStairs1( n -2 );
	}
	
	//用循环来解决
	public static int climbStairs2(int n){
		if( n== 1 ) return 1;
		if( n == 2 ) return 2;
		//n>=3
		int [ ] result = new int[ n+1 ];
		result[ 0 ] = 0;
		result[ 1 ] = 1;
		result[ 2 ] = 2;
		for(int i = 3; i <= n; i++){
			result[ i ] = result[ i-1 ]+result[ i-2 ];
		}
		return result[ n ];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs1(1));
		System.out.println(climbStairs1(2));
		System.out.println(climbStairs1(3));
		System.out.println(climbStairs1(44));
		
		System.out.println(climbStairs2(1));
		System.out.println(climbStairs2(2));
		System.out.println(climbStairs2(3));
		System.out.println(climbStairs2(44));
	}

}
