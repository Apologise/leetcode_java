package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution14 {
	public static List< List< Integer >> threeSum(int [ ] nums){
		//先将数组排序
		Arrays.sort(nums);
		List<List< Integer >> list = new ArrayList<List< Integer >>();
		for(int i = 0; i< nums.length; i++){
			if(i == 0||(i > 0 && nums[ i ] != nums[ i-1] )){
				int low = i+1, high = nums.length-1, sum = 0-nums[i];
				while(low<high){
					if( nums[low] + nums[high] == sum){
						list.add(Arrays.asList( nums[i], nums[low], nums[high]));
						//判断下一个元素是否和这个元素相同，如果相同就继续low++遍历,这就是为什么要排序的原因
						//排完序后相同的元素都在一起
						while( low < high && nums[ low ] == nums[ low+1 ]) low++;
						while(high > low && nums[ high ] == nums[high-1] ) high--;
						low++;high--;
						//判断向前的和是否小于sum，如果小了，那么就是nums[low]小了
					} else if( nums[low] + nums[high] < sum ){
						low++;
					//反之就是high大了
					}else{ high--;}
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] nums = {-1, 0 ,1, 2, -1, -4};
		List< List< Integer >>  list = Solution14.threeSum(nums);
		Iterator it = list.iterator();
		for(int i = 0; i< list.size() ; i++){
			System.out.println(list.get(i));
		}
	}
}
