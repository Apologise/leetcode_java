package com.leetcode;

public class Solution6_ZigZag {
	public String convert(String s, int nRows){
		String result = new String();
		int len = s.length();
		/*定义一个循环周期长度，例如，第一个字符下标为i，那么这个周期的最后一个字符是
		*(nRows-1)*2
		*/
		int pipe = (nRows-1)*2;
		int n = 0;
		while(n<nRows){ 
			for( int i = n;i<len;i = i+pipe ){
				result+=s.charAt(i);
				//在一个循环周期中如果n>0并且n<nRows-1，即在中间的行数，那么除了周期的端点外，中间也有字符，
				//2*nRows-2-2*n+i自己用数学公式推导出来就可以
				if(n>0&&n<nRows-1&&2*nRows-2-2*n+i<len)
					result+=s.charAt(2*nRows-2-2*n+i);
			}
			n++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Solution6_ZigZag test = new Solution6_ZigZag();
		System.out.printf(test.convert("AQWBMZKCYNZD", 3));
	}
}
