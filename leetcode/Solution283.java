import java.util.*;

public class Solution283{
	public static int[] MoveZeros(int[] nums){
		for(int i = 0; i < nums.length&&nums[i]==0; i++){
			System.out.println("===");
			System.out.println(nums[i]);
			System.out.println("===");
			for(int j = i+1; j < nums.length; j++){
				System.out.println("---");
				System.out.println(nums[j]);
				System.out.println("---");
				if(nums[j]!=0){
				nums[i] = nums[j];
				nums[j] = 0;

				break;
			}
			}
		}
		return nums;
	}

	public static void main(String[] args){
		int[] a ={0,1,0,3,4};
		System.out.println(Arrays.toString(Solution283.MoveZeros(a)));
	}
}