package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution14 {
	public static List< List< Integer >> threeSum(int [ ] nums){
		//�Ƚ���������
		Arrays.sort(nums);
		List<List< Integer >> list = new ArrayList<List< Integer >>();
		for(int i = 0; i< nums.length; i++){
			if(i == 0||(i > 0 && nums[ i ] != nums[ i-1] )){
				int low = i+1, high = nums.length-1, sum = 0-nums[i];
				while(low<high){
					if( nums[low] + nums[high] == sum){
						list.add(Arrays.asList( nums[i], nums[low], nums[high]));
						//�ж���һ��Ԫ���Ƿ�����Ԫ����ͬ�������ͬ�ͼ���low++����,�����ΪʲôҪ�����ԭ��
						//���������ͬ��Ԫ�ض���һ��
						while( low < high && nums[ low ] == nums[ low+1 ]) low++;
						while(high > low && nums[ high ] == nums[high-1] ) high--;
						low++;high--;
						//�ж���ǰ�ĺ��Ƿ�С��sum�����С�ˣ���ô����nums[low]С��
					} else if( nums[low] + nums[high] < sum ){
						low++;
					//��֮����high����
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
