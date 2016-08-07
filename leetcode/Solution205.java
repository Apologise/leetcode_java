package com.leetcode;

public class Solution205 {
	public boolean isIsomorphic(String s, String t){
		int[] map = new int[128];
		int[] book = new int[128];
		for(int i = 0; i < s.length(); i++){
			int tag_s = s.charAt(i);
			int tag_t = t.charAt(i);
			//�����Ϊ0��ʾ���Խ���ӳ���ϵ���������Ϊ0�����ӳ����
			if( map[tag_s] == 0 && book[tag_t] == 0 ){
				map[tag_s] = tag_t;
				book[tag_t] = 1;//��������ֵΪ1��ʾ����ĸ�������Ѿ�������ӳ���ϵ
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
