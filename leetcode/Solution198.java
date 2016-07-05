package com.leetcode;

public class Solution198 {
	public int max(int a, int b){
		return a>b? a:b;
	}
	
	public int rob(int[] nums){
		int even = 0;
		int odd = 0;
		for(int i = 0; i < nums.length; i++){
			if(i%2==0){
				even = max(even+nums[i],odd);
			}else{
				odd = max(odd+nums[i],evne);
			}
		}
		return max(odd,even);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
