package com.leetcode;

public class Solution58 {
	public static int lastWordLength(String str){
		if( str.lastIndexOf(' ') != -1)
			return str.trim().length()-str.trim().lastIndexOf(' ')-1;
		else
			return str.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a ";
		System.out.println(Solution58.lastWordLength(str));
	}

}
