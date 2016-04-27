package com.leetcode;

import java.util.Arrays;

public class Solution26 {
	//O(n^2)
	public static int removeDuplicates1( int [ ] nums ){
		int len=nums.length;
		int temp = nums[0];
		for(int i = 1; i< nums.length-2; i++){
			if( temp == nums[i]){
				len -= 1;
				for(int j = i; j<=nums.length-1;j++){
					nums[ j-1 ] = nums[ j ];
				}
			}
			temp = nums[i];
		}
		return len;
	}
	
	//O(n)
	
	public  static int removeDuplicates2(int [ ] nums){
		int i = 0;
		for(int n : nums){
			if( i == 0 || n > nums[i-1]){
				nums[ i++ ] = n;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		int[ ] nums={1,1,2,2,3,4};
		System.out.println(Arrays.toString(nums));
		System.out.println(Solution26.removeDuplicates1(nums));
		System.out.println(Arrays.toString(nums));
		
		//2
		System.out.println();
		System.out.println(Arrays.toString(nums));
		System.out.println(Solution26.removeDuplicates2(nums));
		System.out.println(Arrays.toString(nums));
	}

}
