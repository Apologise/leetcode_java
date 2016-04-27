package com.leetcode;

import java.util.Arrays;

public class Solution15 {
	public static int threeSumClosest(int[ ] nums, int target){ 
		Arrays.sort(nums);
		int tempClosest = nums[0]+nums[1]+nums[nums.length-1];
		for(int i = 0; i < nums.length-2; i++){
			int low = i+1, high = nums.length-1;
			while(low<high){
				int sum=  nums[low]+nums[high]+nums[i];
				if(sum >target){
					high--;
				}
				else {
					low++;
				}
				if(Math.abs(sum-target)<Math.abs(tempClosest-target)){
					tempClosest = sum;
				}
				}
			}
		return tempClosest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] nums = {-1, 2, 1, -4};
		System.out.println("这是要渣了吗");
		System.out.println(Solution15.threeSumClosest(nums, 1));

	}
}
