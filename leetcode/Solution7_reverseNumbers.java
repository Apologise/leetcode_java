package com.leetcode;

public class Solution7_reverseNumbers {
	public int reverseNumber(int num){
		//�����������ݵ�λ��
		int len = String.valueOf(num).length();
		if(num<0){
			len = len-1;
		}
		if(num ==0)
			return num;
		int[] temp = new int[len];
		int result = 0;
                                                                                                                                                                                                                                                                                                                                                                               
	    /*
	     * ע�����е��ж�������num!=0����ʾnum����С������Ϊnum��int��
	     * */
		for(int i = 0;num!=0;i++){
			temp[i] = num%10;
			num = num/10;
		}
		for(int i = 0;i<len;i++){
			result+=temp[i]*Math.pow(10, len-i-1);
		}
		return  result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution7_reverseNumbers test = new Solution7_reverseNumbers();
		System.out.println(test.reverseNumber(-123));
	}
}
