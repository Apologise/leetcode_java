package com.leetcode;

public class Solution172 {
/*����һ����n����n����ĩβ0�ĸ���
 * ���ǿ���5�ĸ�������Ϊ����n!������2�ĸ����϶���������5�ĸ����ġ�����
 * ����ֻ��Ҫͳ������5�ĸ�������������Ҫ�Ľ������Ȼ��5^x.
 * */
	public int tralingzeros(int num){
		if( num  == 0) return 1;
		int result = 0;
		while( num > 0){
			num /= 5;
			result += num;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
