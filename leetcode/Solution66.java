package com.leetcode;


//��һ�����洢�������У�Ȼ�������+1�����ʱ�洢�ĸ�����
public class Solution66 {
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
        	if(digits[i] < 9){
        		//��λ����+1��Ȼ�󷵻ظ�����
        		digits[i] ++;
        		return digits;
        	}
        	digits[i] = 0;
        }
        
        //��������999999...999��ʱ��+1��������Ϊ1000000.....
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
