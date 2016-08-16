package com.leetcode;

import java.util.HashMap;
import java.util.Map;

//字符串匹配问题
public class Solution290 {
	/*1.首先比较pattern和str中单词个数，看是否相等。
	 * 2.用spilt()函数分离单词,得到各个单词的字符串数组
	 * 3.利用map来匹配
	 * */
	public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");//利用空格作为参数来分离各个单词
        //如果长度不相等，那么就不匹配
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
