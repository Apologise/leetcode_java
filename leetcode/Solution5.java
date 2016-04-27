package com.leetcode;

/**
 * 求一个字符串中最长的回文字符串
 * */
public class Solution5 {
	public int start;
	public int maxLen;
	
	public String longestPalindromic(String s){
		if(s.length() <2 )
			return s;
		for(int i = 0;i<s.length()-1;i++){
			//如果回文字符串长度为奇数
			extendPalindromic(s,i,i);
			//如果回文字符串产长度是偶数
			extendPalindromic(s,i,i+1);
		}
		//注意，substring是前闭后开，即start+maxLen，不要多此一举减1
		return s.substring(start,start+maxLen);
	}
	
	private void extendPalindromic(String s,int i,int j){
		
		/**
		 * 要注意判断语句的循序，否则会报错，例如这样的写法是错误的
		 * 	for(;s.charAt(i) == s.charAt(j)&&i>=0&&j<s.length();i--,j++);
		 *上面的写法会报错，数组下标越界，因为是先执行s.charAt(i)，然后在判断i>=0
		 *所以在i = -1时执行s.charAt(i)自然会报错，所以不能那样写！！！
		 * */
		for(;i>=0&&j<s.length()&&s.charAt(i) == s.charAt(j);i--,j++);
		/**
		 * 注意，一定以弄清楚长度为什么是j-i-1！！！
		 * 因为当for循环结束时，i和j分别位于回文字符串的前一个字符和后一个字符,如下图所示
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
