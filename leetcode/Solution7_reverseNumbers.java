package com.leetcode;

public class Solution7_reverseNumbers {
	public int reverseNumber(int num){
		//计算整形数据的位数
		int len = String.valueOf(num).length();
		if(num<0){
			len = len-1;
		}
		if(num ==0)
			return num;
		int[] temp = new int[len];
		int result = 0;
                                                                                                                                                                                                                                                                                                                                                                               
	    /*
	     * 注意其中的判断条件，num!=0即表示num不是小数，因为num是int型
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
