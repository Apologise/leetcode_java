package com.leetcode;

import java.util.Scanner;

public class Solution344 {
	public static String reverseString(String s){
		//现将字符串转换成字符数组
		char[ ] str = s.toCharArray();
		for(int i = 0; i < str.length/2; i++){
			char c = str[i];
			str[i] = str[str.length-i-1];
			str[str.length-i-1] = c;
		}
		
		//将字符串数组转化成字符转有2中方法，
		//1，调用String的valueOf方法
		//2.直接new一个String
		System.out.println(String.valueOf(str));
		return new String(str);
	} 
	
	//将字符串数组
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello world!"));
		
	}

}
