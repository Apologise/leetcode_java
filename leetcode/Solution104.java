package com.leetcode;

 
 
public class Solution104 {
	public  int maxDepth(TreeNode root) {
		int left = 0, right = 0;
		if(root == null ) return 0;
        else{
        	 left = maxDepth(root.left);
        	 right = maxDepth(root.right);
        	return left > right ? left+1 : right+1;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
