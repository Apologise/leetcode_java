package com.leetcode;

import java.util.HashMap;
import java.util.Map;

//�ַ���ƥ������
public class Solution290 {
	/*1.���ȱȽ�pattern��str�е��ʸ��������Ƿ���ȡ�
	 * 2.��spilt()�������뵥��,�õ��������ʵ��ַ�������
	 * 3.����map��ƥ��
	 * */
	public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");//���ÿո���Ϊ�����������������
        //������Ȳ���ȣ���ô�Ͳ�ƥ��
        if(pattern.length() != words.length) { return false;}
        Map index = new HashMap();
        for(Integer i = 0; i < words.length; i++){
        	if( index.put(pattern.charAt(i), i) != index.put( words[i],i)) { return false;}
        }
        return true;    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
