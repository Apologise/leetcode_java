package com.leetcode;

public class Solution111 {
	public  int minDepth(TreeNode root) {
		int left = 0, right = 0;
		if(root == null ) return 0;
        else{
        	 left = minDepth(root.left);
        	 right = minDepth(root.right);
        	return (left == 0 || right == 0 ) ? left + right +1 : Math.min(left, right)+1;
        }
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
