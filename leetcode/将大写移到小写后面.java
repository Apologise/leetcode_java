package com.leetcode;

public class ����д�Ƶ�Сд���� {
	public static String upperAfterLower(String str){
		//��д��ĸ�ķ�Χ��65-90
		char[] s = str.toCharArray();
		int k = 0;//k����ǰ���Ѿ�����Ĵ�д�ĸ���������aBB����ôk����2����ʾ�Ѿ���2����д��ĸ����ȷ��λ��
		for(int i = s.length-1; i >=0; i--){
			if('A'<=s[i] && s[i]<='Z'){
				char temp = s[i];
				//����ȷ��ĸ��ǰһ����ĸ
				int j = i;
				for(; j < s.length-k-1; j++){
					s[j] = s[j+1];
				}
				s[j] = temp;
				k++;
			}
		}
		return String.valueOf(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asafBasdfDDDdsafD";
		System.out.println(����д�Ƶ�Сд����.upperAfterLower(str));
	}

}
