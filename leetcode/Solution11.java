package com.leetcode;

public class Solution11 {
	public static int container ( int[ ] a ) {
		int container = 0 ;
		for(int i = 0; i < a.length ; i++){
			for(int j =i+1; j< a.length; j++){
				if( a[ i ] > a[ j ] ){
					a [ i ] = a [ j ];
				}
				int thisContainer = (j-i) * a [ i ] ;
				if( thisContainer > container ){
					container = thisContainer;
				}
			}
		}
		return container;
	}
	
	public static int maxArea(int[] height) {
	    int left = 0, right = height.length - 1;
	    int maxArea = 0;

	    while (left < right) {
	        maxArea = Math.max(maxArea, Math.min(height[left], height[right])
	                * (right - left));
	        if (height[left] < height[right])
	            left++;
	        else
	            right--;
	    }

	    return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] a = {3,7,3,4,5,10};
		System.out.println(Solution11.container(a));
		System.out.println(Solution11.maxArea(a));
	}
}
