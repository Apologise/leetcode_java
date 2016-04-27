package com.leetcode;

/**
 * ��һ���ַ�������Ļ����ַ���
 * */
public class Solution5 {
	public int start;
	public int maxLen;
	
	public String longestPalindromic(String s){
		if(s.length() <2 )
			return s;
		for(int i = 0;i<s.length()-1;i++){
			//��������ַ�������Ϊ����
			extendPalindromic(s,i,i);
			//��������ַ�����������ż��
			extendPalindromic(s,i,i+1);
		}
		//ע�⣬substring��ǰ�պ󿪣���start+maxLen����Ҫ���һ�ټ�1
		return s.substring(start,start+maxLen);
	}
	
	private void extendPalindromic(String s,int i,int j){
		
		/**
		 * Ҫע���ж�����ѭ�򣬷���ᱨ������������д���Ǵ����
		 * 	for(;s.charAt(i) == s.charAt(j)&&i>=0&&j<s.length();i--,j++);
		 *�����д���ᱨ�������±�Խ�磬��Ϊ����ִ��s.charAt(i)��Ȼ�����ж�i>=0
		 *������i = -1ʱִ��s.charAt(i)��Ȼ�ᱨ�����Բ�������д������
		 * */
		for(;i>=0&&j<s.length()&&s.charAt(i) == s.charAt(j);i--,j++);
		/**
		 * ע�⣬һ����Ū�������Ϊʲô��j-i-1������
		 * ��Ϊ��forѭ������ʱ��i��j�ֱ�λ�ڻ����ַ�����ǰһ���ַ��ͺ�һ���ַ�,����ͼ��ʾ
		 * i                  j
		 * m a b c b a k
		 * */
		if(maxLen<j-i-1){
			start = i+1;
			maxLen = j-i-1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "acsabcbamm";
		Solution5 solution = new Solution5();
		System.out.println(solution.longestPalindromic(str));
	}

}
