package com.leetcode;

import java.math.*;
public class Solution171 {
	public static int titleToNumber(String s){
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			//这里求267的幂可以用result *= 26； 
			result += (s.charAt(i)-'A'+1)*Math.pow(26, s.length()-i-1);
		}
		return result;
	}

	public static void main(String[] args){
		String s = new String("AAA");
		System.out.println(Solution171.titleToNumber(s));
	}
}
