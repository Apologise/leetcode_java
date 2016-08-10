package com.leetcode;

public class Solution88_2 {
public static void merge(int[] nums1, int m, int[] nums2, int n) {
      int index = m+n-1;
      int i = m-1;
      int j = n-1;
      while( i>=0 && j >= 0){
    	  if(nums2[j] > nums1[i]){
    		  nums1[index--] = nums2[j--];
    	  }else{
    		  nums1[index--] = nums1[i--];
    		}
      }
    //���nums2��û�б�����,��ʣ�µ�ȫ���ӵ�nums1��  
      while( j >= 0 && i >= 0){
		  nums1[index--] = nums2[j--];
	  }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3,4,5,0,0,0};
		int[] nums2 =  {2,7,9};
		Solution88_2.merge(nums1, 7, nums2, 3);
	}

}
