package com.leetcode;

public class Solutio101 {
	public boolean isSymmetric(TreeNode root){
		if( root == null )
			return true;
		return isSymmetricHelp(root.left, root.right);
		}
		
		//辅助函数，因为比较的是左右两个结点的值，而给出的函数是有一个结点，
		//所以需要重新定义一个方法
		public boolean isSymmetricHelp(TreeNode left, TreeNode right){
				if( left == null && right == null) return true;
				if( left == null || right == null ) return false;
				if( left.val == right.val){
					return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(right.left, left.right);
				}else{
					return false;
				}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
