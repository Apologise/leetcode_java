package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//���һ�����ĳ��ֵĴ�����������ռ��С��1/2,��ô�������Ƶ�ʿ϶����ڵ���������Ƶ�ʵ��ܺ�
//���ԣ����ǿ�������һ����־����һ������������ͳ����Ƶ��
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
	
	//��Ϊ���ķ�����ֱ�ӽ���������Ȼ��ȥ���м����
	public int majorElement1(int[] nums){
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	public int majorElement2(int[] nums){
		Map<Integer, Integer> number = new HashMap<Integer, Integer>();
		int n = nums.length;
		int major = 0;
		
		//�����е����ַ���Hashmap��
		for(int num: nums){
			//���map��û�����������ô�����������map�У����ҽ�value��Ϊ1
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
