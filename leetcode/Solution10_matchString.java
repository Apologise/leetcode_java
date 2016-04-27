package com.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 1.��򵥵Ľⷨ��ֱ����������ʽ
 * 2.DFS:�������ж�������
 * 			a:���str1��str2��Ϊ���򷵻�true����ֻ������һ��Ϊ���򷵻�false
 * 			b:���str2��������ʽ����Ϊ1���������������û��'*'����ô�����ǰָ����ַ���[0]��'.'������ȵĻ���
 * 				�ݹ飬�����ж�
 * 			c.�����ǰָ����ַ�������'*'�ǺŵĻ��Ͳ��ҵ�ǰ���ַ���ȣ���ôstr2������ƶ�2���ַ���str1�ƶ�һ���ַ�����ݹ�
 * */

public class Solution10_matchString {
	
	public boolean isMatch(String a,String b){
		Pattern pattern = Pattern.compile("^"+a+"$");
		Matcher matcher = pattern.matcher(b);
		return matcher.find();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10_matchString test=  new Solution10_matchString();
		System.out.println(test.isMatch("c*a*b", "aab"));
	}

}
