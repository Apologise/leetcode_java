package com.leetcode;

public class Solution172 {
/*给定一个数n，求n！的末尾0的个数
 * 我们可以5的个数，因为对于n!，因子2的个数肯定多余因子5的个数的。所以
 * 我们只需要统计因子5的个数便是我们想要的结果。自然是5^x.
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
