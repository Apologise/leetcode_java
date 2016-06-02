package com.leetcode;
public class Solution242_{
	public  static boolean isAnagram(String s, String t){
		//定义一个可以存放26个英文字母标示的数组
		int[] alphabet = new int[26];
		for(int i = 0; i < s.length(); i++){
			//注意，数组的初始值为0
			alphabet[s.charAt(i)-'a']++;
		}
		//抵消上面的字符
		for(int i = 0; i < t.length(); i++){
			alphabet[t.charAt(i)-'a']--;
		}

		//遍历数组
		for(int i = 0; i < alphabet.length; i++){
			System.out.println(alphabet[i]+"  "+i);
			if(alphabet[i] != 0)return false;
		}
		return true;
	}

	public static void main(String[] args){
		String s = "yanghao";
		String t = "angyaoh";
		System.out.println(Solution242_.isAnagram(s, t));
	}
}
