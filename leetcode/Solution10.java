package com.leetcode;

public class Solution10 {
	public static boolean isMatch(String str1,String str2){
		/*当str1和str2都为空时满足情况，只有当其中一个不为空就返回false
		 * */
		if(str1.isEmpty()){
			return str2.isEmpty();
		}
		
		/*
		 * 当str2(正则表达式)只有一个字符时，并且首字符的下一个字符不是*的时候:
		 * 如果当前的字符相等，则str1和str2都后移一个元素
		 * 如果不相等，或者str1此时为空的时候（注意，不要被上面的判断为空的语句干扰，因为这里是调用的是substring，
		 * 每次更新后str1是子串而不是原来的字符串，也就是说初始字符串不是空，但是子串可以到最后为空）
		 * 也就是说如果str1为空，而且str2只有一个字符，则不匹配
		 * 否则就str1,str2取下一个字符为首字符，并使之成为子串
		 * */
		if(str2.length()==1||str2.charAt(1)!='*'){
			if(str1.isEmpty()||(str2.charAt(0)!='.'&&str1.charAt(0)!=str2.charAt(0))){
				return false;
			}else{
				return isMatch(str1.substring(1),str2.substring(1));
			}
		}
		
		/*
		 * 当正则表示式的长度大于1时并且str2.charAt(1)是'*'的时候，并且str2不为空（这个是为了遍历str2）并且首字符相等，或者str2首字符为'.'：
		 * 并且判断'*'后面的字符是否与当前的str1的首字符相等，因为'*'可以表示0个它前面的字符,例如：str1="a",str2="a*a"那么这样也是可以匹配的
		 * 否则就str1后移一个字符，继续循环str2;
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
