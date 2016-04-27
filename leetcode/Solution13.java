package com.leetcode;

import java.util.Arrays;

public class Solution13 {
	public static String findLongestPrefix(String[ ] str ){
		String result = new String("");
		if(str != null && str.length>0){
			Arrays.sort(str);
		}
			String temp = new String();
			temp = str[0] ;
			for(int i = 0;i<temp.length(); i++){
				if(str[str.length-1].length()>i&&str[str.length-1].charAt(i)==temp.charAt(i)){
					result += temp.charAt(i);
				}
				else{
					return result;
				}
			}
			return result;
		}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[ ] str ={"abcd", "abcf", "abdcg","abch"};
		System.out.println(Solution13.findLongestPrefix(str));
	}
}
