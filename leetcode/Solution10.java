package com.leetcode;

public class Solution10 {
	public static boolean isMatch(String str1,String str2){
		/*��str1��str2��Ϊ��ʱ���������ֻ�е�����һ����Ϊ�վͷ���false
		 * */
		if(str1.isEmpty()){
			return str2.isEmpty();
		}
		
		/*
		 * ��str2(������ʽ)ֻ��һ���ַ�ʱ���������ַ�����һ���ַ�����*��ʱ��:
		 * �����ǰ���ַ���ȣ���str1��str2������һ��Ԫ��
		 * �������ȣ�����str1��ʱΪ�յ�ʱ��ע�⣬��Ҫ��������ж�Ϊ�յ������ţ���Ϊ�����ǵ��õ���substring��
		 * ÿ�θ��º�str1���Ӵ�������ԭ�����ַ�����Ҳ����˵��ʼ�ַ������ǿգ������Ӵ����Ե����Ϊ�գ�
		 * Ҳ����˵���str1Ϊ�գ�����str2ֻ��һ���ַ�����ƥ��
		 * �����str1,str2ȡ��һ���ַ�Ϊ���ַ�����ʹ֮��Ϊ�Ӵ�
		 * */
		if(str2.length()==1||str2.charAt(1)!='*'){
			if(str1.isEmpty()||(str2.charAt(0)!='.'&&str1.charAt(0)!=str2.charAt(0))){
				return false;
			}else{
				return isMatch(str1.substring(1),str2.substring(1));
			}
		}
		
		/*
		 * �������ʾʽ�ĳ��ȴ���1ʱ����str2.charAt(1)��'*'��ʱ�򣬲���str2��Ϊ�գ������Ϊ�˱���str2���������ַ���ȣ�����str2���ַ�Ϊ'.'��
		 * �����ж�'*'������ַ��Ƿ��뵱ǰ��str1�����ַ���ȣ���Ϊ'*'���Ա�ʾ0����ǰ����ַ�,���磺str1="a",str2="a*a"��ô����Ҳ�ǿ���ƥ���
		 * �����str1����һ���ַ�������ѭ��str2;
		 * 
		 * */
		while(!str2.isEmpty()&&(str1.charAt(0)==str2.charAt(0)||str2.charAt(0)=='.')){
			if(isMatch(str1,str2.substring(2))){
				return true;
					}
			str1=  str1.substring(1);
		}
		return isMatch(str1,str2.substring(2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution10.isMatch("aab", "a*b"));
	}

}
