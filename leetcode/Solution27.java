package com.leetcode;

import java.util.Arrays;

public class Solution27 {
	//解法参照第26题
	 public static int removeElement(int[] nums, int val) {
		 	int n = 0;
		 	for(int i = 0; i< nums.length ; i++){
		 		if( nums[ i ] !=  val){
		 			nums[n++] = nums[i];
		 		}
		 	}
		 	return n;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] nums={1,2,3,3,4,5,6};
		System.out.println(Solution27.removeElement(nums, 3));
		System.out.println(Arrays.toString(nums));
	}

}
