package com.leetcode;


/*注意：负数不是回文数
 * 
 * 解法一：将整型数字转换成字符串，然后循环判断
 * 解法二；直接求余运算，类似于求整型数字的逆转数字
 * 
 * */
public class Solution9_isPalindrome {
	//解法一
	public static boolean isPalindrome1(int num){
		//现将整型变为字符串
		String str = num+"";
		int len = str.length();
		for(int i = 0;i<str.length()/2;i++)
			if(str.charAt(i) != str.charAt(len-i-1))
				return false;
		return true;
	}
	
	//解法二
	public static boolean isPalindrome2(int num){
		int res = 0,temp = num;
		if(num<0||num%10==0)
		while(temp!=0){
			res=  res*10+num%10;
			temp=  num/10;
		}
		return res==num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a =- 1243;
//		String str = a+"";
//		System.out.println(str);
		System.out.println(Solution9_isPalindrome.isPalindrome1(0));
		System.out.println(Solution9_isPalindrome.isPalindrome2(0));
	}

}
