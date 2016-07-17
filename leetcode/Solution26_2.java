package com.leetcode;

public class Solution26_2 {
	 public int removeDuplicates(int[] nums) {
	        if(nums.length<2) return nums;
	        int index = 1;
	        for(int i = 1; i < nums.length; i++){
	        	if(nums[i] != nums[i-1]){
	        	nums[index++] = nums[i];
	        	}
	        }
	        return index;;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
