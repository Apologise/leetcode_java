package com.leetcode;
public class Solution242_{
	public  static boolean isAnagram(String s, String t){
		//����һ�����Դ��26��Ӣ����ĸ��ʾ������
		int[] alphabet = new int[26];
		for(int i = 0; i < s.length(); i++){
			//ע�⣬����ĳ�ʼֵΪ0
			alphabet[s.charAt(i)-'a']++;
		}
		//����������ַ�
		for(int i = 0; i < t.length(); i++){
			alphabet[t.charAt(i)-'a']--;
		}

		//��������
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
