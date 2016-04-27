package com.leetcode;

public class Solution6_ZigZag {
	public String convert(String s, int nRows){
		String result = new String();
		int len = s.length();
		/*����һ��ѭ�����ڳ��ȣ����磬��һ���ַ��±�Ϊi����ô������ڵ����һ���ַ���
		*(nRows-1)*2
		*/
		int pipe = (nRows-1)*2;
		int n = 0;
		while(n<nRows){ 
			for( int i = n;i<len;i = i+pipe ){
				result+=s.charAt(i);
				//��һ��ѭ�����������n>0����n<nRows-1�������м����������ô�������ڵĶ˵��⣬�м�Ҳ���ַ���
				//2*nRows-2-2*n+i�Լ�����ѧ��ʽ�Ƶ������Ϳ���
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
