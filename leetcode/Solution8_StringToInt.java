package com.leetcode;

public class Solution8_StringToInt {
//	public int myAtoi(String str){
//		return Integer.parseInt(str);
	
	/*�ⷨ��
	 * 1.�����ո������������ֱ�ӵ���trim������
	 * 2.���������ǿ��ַ������߳���Ϊ0�ͷ���
	 * 3.�������'+'��'-'����sign�ȱ����£�+�ͱ���Ϊ1��-�ͱ���Ϊ-1
	 * 4������ڱ����ַ����Ĺ��������������ֵ��ַ�������ѭ�����ǰ������֣�����Ĳ������
	 * 		���磺��1234a1234����ô��ֻ����int���͵�1234
	 *5.�ж��ַ��Ƿ�����'0'~'9'���Ǿͼ����жϣ������ǰ���ַ���ת����int���ͣ�����Ϊtotal,���total����һ��ѭ��������ģ���
	 *		���a*10����Integer.MAX_VALUE�������ڱ���ѭ����tatol������int����ʾ�����ֵ��ֱ�ӷ���
	 *6.��������պ���һ��ѭ���Ľ��tatol�պõ���Integer.MAX_VALUE/10����ô�ͱȽ����һλ�Ĵ�С�������ǰ����һλ��7��
	 *	�ͳ���int��ʾ�����ֵ��ͬ������Integer.MAX_VALUE����������ҲҪ�õ�sign,���Ϊ����������󣬸��ͷ�����С
	 * */
	public int myAtoi(String str){
		int sign = 1,index = 0, tatol = 0;
		String str1 = str.trim();
		int len = str1.length();
		if(len==0)
			return 0;
		//�ж����ַ���������,ע������ı�̼��ɣ�������Щһ���ж����
		if(str1.charAt(index)=='+'||str1.charAt(index)=='-'){
			sign = str1.charAt(index)=='+' ? 1 : -1 ;
			index++;
		}
		while(index<len){
			int digit = str1.charAt(index)-'0' ;
			//�����������������ַ�������ѭ��
			if(digit<0||digit>9)
				break;
			if(Integer.MAX_VALUE/10<tatol||Integer.MAX_VALUE/10==tatol&&Integer.MAX_VALUE%10<digit)
				return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
			tatol = tatol*10+digit;
			index++;
		}
		return tatol*sign;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "1234124";
//		Solution8_StringToInt test = new Solution8_StringToInt();
//		System.out.println(test.myAtoi(str));
//		char a = '9';
//		System.out.println(a);
//	
//		System.out.println(a-'0');
//		System.out.println(Integer.MAX_VALUE%10);
		Solution8_StringToInt test = new Solution8_StringToInt();
		String str = "";
		System.out.println(test.myAtoi(str));
		
		
	}

	
}
