package com.leetcode;

import java.util.Scanner;

public class Solution344 {
	public static String reverseString(String s){
		//�ֽ��ַ���ת�����ַ�����
		char[ ] str = s.toCharArray();
		for(int i = 0; i < str.length/2; i++){
			char c = str[i];
			str[i] = str[str.length-i-1];
			str[str.length-i-1] = c;
		}
		
		//���ַ�������ת�����ַ�ת��2�з�����
		//1������String��valueOf����
		//2.ֱ��newһ��String
		System.out.println(String.valueOf(str));
		return new String(str);
	} 
	
	//���ַ�������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello world!"));
		
	}

}
