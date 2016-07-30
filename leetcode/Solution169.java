package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//如果一个数的出现的次数大于数组空间大小的1/2,那么这个数的频率肯定大于等于其余数频率的总和
//所以，我们可以设置一个标志量和一个计数器，来统计其频率
public class Solution169 {
	public int majorityElement(int[] nums){
		int n = nums.length;
		int major = nums[0], count = 1;
		for(int i = 1; i < n; i++){
			if(major == nums[i]){
				count ++;
			} else if( count == 0 ){
				count++;
				major = nums[i];
			}else{
				count--;
			}
		}
		return major;
	}
	
	//更为简便的方法，直接将数组排序，然后去最中间的数
	public int majorElement1(int[] nums){
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	public int majorElement2(int[] nums){
		Map<Integer, Integer> number = new HashMap<Integer, Integer>();
		int n = nums.length;
		int major = 0;
		
		//将所有的数字放入Hashmap中
		for(int num: nums){
			//如果map中没有这个数，那么将这个数放入map中，并且将value置为1
			if(!number.containsKey(num)){
				number.put(num,1);
			}else{
				number.put(num, number.get(num)+1);
			}
			if(number.get(num) >= n/2){
				major = num;
				break;
			}
		}
		return major;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
