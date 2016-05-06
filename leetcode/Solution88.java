package com.leetcode;

import java.util.Arrays;

public class Solution88 {
	
	//a=[1,2,6] b=[2,4,8] 合并后c=[1,2,2,4,6,8]，由于题目假设a的数组大小是大于或等于a+b，所以a最终是输出结果
	public static void merge(int [ ] nums1, int m, int [ ] nums2, int n){
		int index = m+n-1;
		int i = m-1;
		int j = n-1;
		while( i >= 0 && j >= 0 ){
			if(	nums1[ i ] < nums2[ j ] )
				nums1[ index-- ] = nums2[ j-- ];
			else
				nums1[ index-- ] = nums1[ i-- ];
		}
//		如果此时nums2还没遍历完
		while( j >= 0){
			nums1[ index-- ] = nums2[ j-- ];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] nums1 =new int[20];
		for(int i = 0; i< 6; i++)
			nums1[ i ] = i;
		int [ ] nums2 = {2,4,5,6,8,9};
		Solution88.merge(nums1, 6, nums2, 6);
		System.out.println(Arrays.toString(nums1));
	}

}
