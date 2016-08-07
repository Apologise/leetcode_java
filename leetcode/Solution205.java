package com.leetcode;

public class Solution205 {
	public boolean isIsomorphic(String s, String t){
		int[] map = new int[128];
		int[] book = new int[128];
		for(int i = 0; i < s.length(); i++){
			int tag_s = s.charAt(i);
			int tag_t = t.charAt(i);
			//如果都为0表示可以建立映射关系，如果都不为0则进行映射检查
			if( map[tag_s] == 0 && book[tag_t] == 0 ){
				map[tag_s] = tag_t;
				book[tag_t] = 1;//将其设置值为1表示该字母或数字已经建立了映射关系
			}else if(map[tag_s] != tag_t){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		char ch = 'A';
		System.out.println((int )ch);
	}
}
