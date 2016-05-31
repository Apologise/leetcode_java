import java.util.*;

public class Solution283{

//O(n^2)
	public static int[] MoveZeros(int[] nums){
		for(int i = 0; i < nums.length; i++){
			if(nums[i]==0){
			for(int j = i+1; j < nums.length; j++){
				if(nums[j]!=0){
				nums[i] = nums[j];
				nums[j] = 0;
				break;
			}
			}
		}
	}
		return nums;
	}


//O(n)
	public static int[] MoveZeros1(int[] nums){
		int index = -1;
		for(int i = 0; i < nums.length; i++){
			//记录0第一次出现的位置
			if(index == -1&&nums[i]==0){
				index = i;
			}
			if(nums[i]!=0&&index!=-1){
				nums[index] = nums[i];
				nums[i] = 0;
				index++;
			}
		}
		return nums;
	}

	public static void main(String[] args){
		int[] a ={1,0,0,3};
		System.out.println(Arrays.toString(Solution283.MoveZeros(a)));
		System.out.println(Arrays.toString(Solution283.MoveZeros1(a)));
	}
}