package com.leetcode;

import java.util.*;

public class Solution13RomanToInteger {
	public static  int romanToInteger(String s){
		if(s.length() == 0 || s == null) return 0;
		int len = s.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = map.get(s.charAt(len-1));
		int privot = result;
		for(int i = len-2; i >= 0; i--){
			int curr = map.get(s.charAt(i));
			if(curr >= privot) result += curr;
			else
				result -= curr;
			privot = curr;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution13RomanToInteger.romanToInteger("VI"));
	}

}
