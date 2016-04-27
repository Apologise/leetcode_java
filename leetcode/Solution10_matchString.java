package com.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 1.最简单的解法：直接有正则表达式
 * 2.DFS:有三个判定条件：
 * 			a:如果str1和str2都为空则返回true，若只有其中一个为空则返回false
 * 			b:如果str2（正则表达式长度为1），并且如果后面没有'*'，那么如果当前指向的字符是[0]是'.'或者相等的话就
 * 				递归，继续判断
 * 			c.如果当前指向的字符后面有'*'星号的话就并且当前的字符相等，那么str2就向后移动2个字符，str1移动一个字符进入递归
 * */

public class Solution10_matchString {
	
	public boolean isMatch(String a,String b){
		Pattern pattern = Pattern.compile("^"+a+"$");
		Matcher matcher = pattern.matcher(b);
		return matcher.find();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10_matchString test=  new Solution10_matchString();
		System.out.println(test.isMatch("c*a*b", "aab"));
	}

}
