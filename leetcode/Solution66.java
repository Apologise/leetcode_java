package com.leetcode;


//将一个数存储在数组中，然后将这个数+1，求此时存储的该数组
public class Solution66 {
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
        	if(digits[i] < 9){
        		//该位的数+1，然后返回该数组
        		digits[i] ++;
        		return digits;
        	}
        	digits[i] = 0;
        }
        
        //当数字是999999...999的时候，+1则整个数为1000000.....
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
